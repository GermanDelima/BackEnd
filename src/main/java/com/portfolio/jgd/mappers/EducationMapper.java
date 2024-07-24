
package com.portfolio.jgd.mappers;

import com.portfolio.jgd.models.Education;
import com.portfolio.jgd.models.dtos.EducationDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EducationMapper {

    public Education dtoToEdu(EducationDto dto){
        Education edu = new Education();
        edu.setInstituto(dto.getInstituto());
        edu.setTitEdu(dto.getTitEdu());

        edu.setFechaInic(dto.getFechaInic());
        edu.setFechaFin(dto.getFechaFin());
        edu.setDescEduc(dto.getDescEduc());
        edu.setLogoCertificado(dto.getLogoCertificado());
        return edu;
    }

    public EducationDto eduToDto(Education education){
    EducationDto dto = new EducationDto();
        dto.setId(education.getId());
        dto.setInstituto(education.getInstituto());
        dto.setTitEdu(education.getTitEdu());

        dto.setFechaInic(education.getFechaInic());
        dto.setFechaFin(education.getFechaFin());
        dto.setDescEduc(education.getDescEduc());
        dto.setLogoCertificado(education.getLogoCertificado());
        return dto;
    }

    }




