package com.portfolio.jgd.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Educacion")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 60, message = "El instituto no puede tener más de 60 caracteres")
    private String instituto;

    @Size(min = 3, max = 60, message = "El titulo no puede tener más de 60 caracteres")
    private String titEdu;

    private String fechaInic;
    private String fechaFin;

    @Size(min = 5, max = 2000, message = "La descripcion de la educacion no puede tener más de 2000 caracteres")
    private String descEduc;

    @Column(name = "logo_certificacion")
    private String logoCertificado;
}
