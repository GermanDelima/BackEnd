package com.portfolio.jgd.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proyecto")
public class Proyecto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(min = 3, max = 60, message = "El nombre del proyecto no puede tener más de 60 caracteres")
  private String nombre;

  @Size(min = 5, max = 2000, message = "La descripcion del proyecto no puede tener más de 2000 caracteres")
  private String descripcion;

  private String fechaInic;
  private String fechaFin;

  private String img;
  private String evidencia;
}
