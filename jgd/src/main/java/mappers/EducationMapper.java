
package mappers;

import com.portfolio.jgd.models.Education;
import com.portfolio.jgd.models.dtos.EducationDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EducationMapper {

    public Education dtoToEdu(EducationDto dto){
        Education edu = new Education();
        edu.setTituloEdu(dto.getTituloEdu());
        edu.setFechaEdu(dto.getFechaEdu());
        edu.setDescEdu(dto.getDescEdu());
        edu.setImgEdu(dto.getImgEdu());
        return edu;
    }
    
    public EducationDto eduToDto(Education education){
    EducationDto dto = new EducationDto();
        dto.setId(education.getId());
        dto.setTituloEdu(education.getTituloEdu());
        dto.setFechaEdu(education.getFechaEdu());
        dto.setDescEdu(education.getDescEdu());
        dto.setImgEdu(education.getImgEdu());
        return dto;
    }
    
    }
    
    


