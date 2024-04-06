
package com.portfolio.jgd.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Educacion")
@Getter 
@Setter
@AllArgsConstructor 
@NoArgsConstructor
public class Education {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String tituloEdu;
private Long fechaEdu;
private String descEdu;
@Column(name = "foto_educacion")
private String imgEdu;
}
