package com.portfolio.jgd.mappers;

import com.portfolio.jgd.models.Sobremi;
import com.portfolio.jgd.models.dtos.SobremiDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SobremiMapper {

  //Mapper de sobremiToDto
  public Sobremi dtoToSobremi(SobremiDto dto){
    Sobremi sobremi = new Sobremi();
    sobremi.setFotoDelPerfil(dto.getFotoDelPerfil());
    sobremi.setFotoDePortada(dto.getFotoDePortada());
    sobremi.setPresentacion(dto.getPresentacion());
    return sobremi;
  }

  //Mapper de dtoToSobremi
  public SobremiDto sobremiToDto(Sobremi sobremi){
    SobremiDto dto = new SobremiDto();
    dto.setId(sobremi.getId());
    dto.setFotoDelPerfil(sobremi.getFotoDelPerfil());
    dto.setFotoDePortada(sobremi.getFotoDePortada());
    dto.setPresentacion(sobremi.getPresentacion());
    return dto;
  }
}
