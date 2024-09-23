package com.portfolio.jgd.services;

import com.portfolio.jgd.mappers.HabilidadMapper;
import com.portfolio.jgd.models.Habilidad;
import com.portfolio.jgd.models.dtos.HabilidadDto;
import com.portfolio.jgd.repositories.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HabilidadService {
  @Autowired
  public HabilidadRepository repository;


  public HabilidadDto createHabilidad(HabilidadDto dto) {
    Habilidad habilidad = repository.save(HabilidadMapper.dtoToHabilidad(dto));
    return  HabilidadMapper.habilidadToDto(habilidad);
  }

  public List<HabilidadDto> getHabilidades() {
    List<Habilidad> habilidades = repository.findAll();
        return habilidades.stream()
            .map(HabilidadMapper::habilidadToDto)
            .collect(Collectors.toList());
  }

  public HabilidadDto editHabilidad(Long id, HabilidadDto dto) {
    if (repository.existsById(id)){
      Habilidad habilidadToModify = repository.findById(id).get();
      if (dto.getNombre()!=null){
        habilidadToModify.setNombre(dto.getNombre());
      }
      if (dto.getImageUrl()!=null){
        habilidadToModify.setImageUrl(dto.getImageUrl());
      }
      Habilidad habilidad = repository.save(habilidadToModify);
      return HabilidadMapper.habilidadToDto(habilidad);
    }
    return null;
  }

  public HabilidadDto deleteHabilidad(Long id) {
    if (repository.existsById(id)){
      repository.deleteById(id);
    }
    return null;
  }
}
