package com.portfolio.jgd.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SobremiDto {
  private Long id;
  private String fotoDelPerfil;
  private String fotoDePortada;
  private String presentacion;
}
