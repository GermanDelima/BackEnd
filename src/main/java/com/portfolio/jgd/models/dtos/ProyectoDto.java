package com.portfolio.jgd.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProyectoDto {
  private Long id;
  private String nombre;
  private String descripcion;
  private String fechaInic;
  private String fechaFin;
  private String img;
  private String evidencia;
}
