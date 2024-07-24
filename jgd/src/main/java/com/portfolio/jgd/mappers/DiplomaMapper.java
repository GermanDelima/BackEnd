
package com.portfolio.jgd.mappers;

import com.portfolio.jgd.models.Diploma;
import com.portfolio.jgd.models.dtos.DiplomaDto;
import lombok.experimental.UtilityClass;

/**
 *
 * @author Josías de Lima
 * 
 * 
 */
@UtilityClass
public class DiplomaMapper {
    //MapperDto a MapperEntity
    
    public Diploma dtoToExpe(DiplomaDto dto){
    Diploma diploma = new Diploma();
    diploma.setLogo(dto.getLogo());
    return diploma;
    }  
    
    //MapperEntity a MapperDto
    public DiplomaDto expeToDto(Diploma diploma){
    DiplomaDto dto = new DiplomaDto();
       dto.setId(diploma.getId());
       dto.setLogo(diploma.getLogo());
    return dto;
    }
}
