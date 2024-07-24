package com.portfolio.jgd.services;

import com.portfolio.jgd.mappers.ProyectoMapper;
import com.portfolio.jgd.mappers.SobremiMapper;
import com.portfolio.jgd.models.Proyecto;
import com.portfolio.jgd.models.dtos.ProyectoDto;
import com.portfolio.jgd.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProyectoService {
  @Autowired
  public ProyectoRepository repository;


  public ProyectoDto crearProyecto(ProyectoDto dto) {
    Proyecto proyecto = repository.save(ProyectoMapper.dtoToProyecto(dto));
    return ProyectoMapper.proyectoToDto(proyecto);
  }

  public ProyectoDto getProyectoById(Long id) {
    if (repository.existsById(id)){
      Proyecto proyecto = repository.findById(id).get();
      return ProyectoMapper.proyectoToDto(proyecto);
    }
    return null;
  }


  public List<ProyectoDto> getProyectos() {
    List<Proyecto> list = repository.findAll();
         return list.stream()
              .map(ProyectoMapper::proyectoToDto)
              .collect(Collectors.toList());

  }

  public ProyectoDto editProyecto(Long id, ProyectoDto dto) {
    if (repository.existsById(id)){
      Proyecto proyectoToModify = repository.findById(id).get();
      if (dto.getNombre()!=null){
        proyectoToModify.setNombre(dto.getNombre());
      }
      if (dto.getDescripcion()!= null){
        proyectoToModify.setDescripcion(dto.getDescripcion());
      }
      if (dto.getFechaInic()!= null){
        proyectoToModify.setFechaInic(dto.getFechaInic());
      }
      if (dto.getFechaFin()!= null){
        proyectoToModify.setFechaFin(dto.getFechaFin());
      }
      if (dto.getImg()!= null){
        proyectoToModify.setImg(dto.getImg());
      }
      if (dto.getEvidencia()!= null){
        proyectoToModify.setEvidencia(dto.getEvidencia());
      }
      Proyecto proyecto = repository.save(proyectoToModify);
     return ProyectoMapper.proyectoToDto(proyecto);
    }
    return null;
  }

  public ProyectoDto eliminar(Long id) {
    if (repository.existsById(id)){
      repository.deleteById(id);

    }
    return null;
  }
}
