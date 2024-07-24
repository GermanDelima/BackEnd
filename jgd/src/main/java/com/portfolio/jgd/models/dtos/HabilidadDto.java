package com.portfolio.jgd.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HabilidadDto {
  private Long id;
  private String nombre;
  private String imageUrl;
}
