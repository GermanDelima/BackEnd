 
package com.portfolio.jgd.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Size;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "nombre")
//@NotBlank(message = "El nombre de usuario no puede ser ni null ni cadena vacia ni debe contener espacios en blanco")
//@Size(min = 5,  max = 15, message = "El nombre de usuario no puede tener más de 15 caracteres")
private String nombre;

@Column(name = "apellido")
//@NotNull(message = "El apellido de usuario no puede ser null")
private String apellido;


private String titulo;

@Size(min = 5,  max = 2000, message = "La descripcion de usuario no puede tener más de 2000 caracteres")
private String descripcion;

@Column(name = "foto_perfil")
private String img;
}
