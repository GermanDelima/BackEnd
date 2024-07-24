package com.portfolio.jgd.services;

import com.portfolio.jgd.mappers.SobremiMapper;
import com.portfolio.jgd.models.Sobremi;
import com.portfolio.jgd.models.dtos.SobremiDto;
import com.portfolio.jgd.repositories.SobremiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SobremiService {
  @Autowired
  public SobremiRepository repository;


  //editar
  public SobremiDto editSobremi(Long id, SobremiDto dto) {
    if (repository.existsById(id)){
       Sobremi sobremiToModify = repository.findById(id).get();
       if (dto.getFotoDelPerfil()!=null){
         sobremiToModify.setFotoDelPerfil(dto.getFotoDelPerfil());
       }
       if (dto.getFotoDePortada()!=null){
         sobremiToModify.setFotoDePortada(dto.getFotoDePortada());
       }
      if (dto.getPresentacion()!=null){
        sobremiToModify.setPresentacion(dto.getPresentacion());
      }
      Sobremi sobremi = repository.save(sobremiToModify);
      return SobremiMapper.sobremiToDto(sobremi);
    }
    return null;
  }

  public String deleteSobremi(Long id) {
    if(repository.existsById(id)){
      repository.deleteById(id);
      return "Eliminado SobreMi";
    }
    return null;
  }

  public SobremiDto getSobremiById(Long id) {
    if (repository.existsById(id)){
      Sobremi sobremi = repository.findById(id).get();
      return SobremiMapper.sobremiToDto(sobremi);
    }
    return null;
  }

  public List<SobremiDto> getSobremiAll() {
    List<Sobremi> sobremis = repository.findAll();
        return sobremis.stream()
            .map(SobremiMapper::sobremiToDto)
            .collect(Collectors.toList());

  }

  public SobremiDto createSobremi(SobremiDto dto) {
    Sobremi sobremi = repository.save(SobremiMapper.dtoToSobremi(dto));
    return SobremiMapper.sobremiToDto(sobremi);
  }
}
