package com.portfolio.jgd.mappers;

import com.portfolio.jgd.models.Proyecto;
import com.portfolio.jgd.models.dtos.ProyectoDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProyectoMapper {



  //dtoToProyecto
  public Proyecto dtoToProyecto(ProyectoDto dto){
  Proyecto proyecto = new Proyecto();
  proyecto.setNombre(dto.getNombre());
  proyecto.setDescripcion(dto.getDescripcion());
  proyecto.setFechaInic(dto.getFechaInic());
  proyecto.setFechaFin(dto.getFechaFin());
  proyecto.setImg(dto.getImg());
  proyecto.setEvidencia(dto.getEvidencia());
  return proyecto;
  }

  //proyectoToDto
  public ProyectoDto proyectoToDto(Proyecto proyecto){
    ProyectoDto dto = new ProyectoDto();
    dto.setId(proyecto.getId());
    dto.setNombre(proyecto.getNombre());
    dto.setDescripcion(proyecto.getDescripcion());
    dto.setFechaInic(proyecto.getFechaInic());
    dto.setFechaFin(proyecto.getFechaFin());
    dto.setImg(proyecto.getImg());
    dto.setEvidencia(proyecto.getEvidencia());
    return dto;
  }
}
