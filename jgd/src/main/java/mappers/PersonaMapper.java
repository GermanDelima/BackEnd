
package mappers;

import com.portfolio.jgd.models.Persona;
import com.portfolio.jgd.models.dtos.PersonaDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PersonaMapper {
    //retorna una persona para la base de datos
    public Persona dtoToPersona(PersonaDto dto){
    Persona persona = new Persona();
    persona.setNombre(dto.getNombre());
    persona.setApellido(dto.getApellido());
    persona.setImg(dto.getImg());
    return persona;
    }
    
public PersonaDto personaTodto(Persona persona){
    PersonaDto dto = new PersonaDto();
    dto.setId(persona.getId());
    dto.setNombre(persona.getNombre());
    dto.setApellido(persona.getApellido());
    dto.setImg(persona.getImg());
    return dto;
    
}    
}
