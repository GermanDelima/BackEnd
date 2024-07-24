package com.portfolio.jgd.mappers;

import com.portfolio.jgd.models.Habilidad;
import com.portfolio.jgd.models.dtos.HabilidadDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HabilidadMapper {
  //Mapper dtoToEntity
  public Habilidad dtoToHabilidad(HabilidadDto dto){
    Habilidad habilidad = new Habilidad();
    habilidad.setNombre(dto.getNombre());
    habilidad.setImageUrl(dto.getImageUrl());
    return habilidad;
  }

  //Mapper entityToDto
  public HabilidadDto habilidadToDto(Habilidad habilidad){
    HabilidadDto dto = new HabilidadDto();
    dto.setId(habilidad.getId());
    dto.setNombre(habilidad.getNombre());
    dto.setImageUrl(habilidad.getImageUrl());
    return dto;
  }
}
