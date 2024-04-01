
package com.portfolio.jgd.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Persona")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "nombre")
@NotBlank(message = "El nombre de usuario no puede estar vacío")
@Size(min = 5,  max = 15, message = "El nombre de usuario no puede tener más de 15 caracteres")
private String nombre;

@Column(name = "apellido")
@NotNull(message = "El apellido de usuario no puede estar vacío")
private String apellido;

@Column(name = "foto_perfil")
private String img;
}
