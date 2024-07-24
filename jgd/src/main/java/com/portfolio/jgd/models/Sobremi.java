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
@Table(name = "sobre_mi")
public class Sobremi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "fotoDelPerfil")
  private String fotoDelPerfil;

  @Column(name = "fotoDePortada")
  private String fotoDePortada;

  @Size(min = 20, max = 2000, message = " La presentación del usuario no puede tener más de 2000 caracteres")
  @Column(name = "presentacion")
  private String presentacion;
}
