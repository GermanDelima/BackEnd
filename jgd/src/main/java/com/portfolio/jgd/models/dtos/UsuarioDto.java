
package com.portfolio.jgd.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDto {
private Long id;
private String nombre;
private String apellido;
private String titulo;
private String descripcion;
private String img;
}
