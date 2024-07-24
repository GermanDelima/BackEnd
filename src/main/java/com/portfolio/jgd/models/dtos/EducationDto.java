
package com.portfolio.jgd.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor
@Getter @Setter

public class EducationDto {
private Long id;
private String instituto;
private String titEdu;
private String fechaInic;
private String fechaFin;
private String descEduc;
private String logoCertificado;
}
