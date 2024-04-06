
package mappers;

import com.portfolio.jgd.models.Usuario;
import com.portfolio.jgd.models.dtos.UsuarioDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {
    //retorna una persona para la base de datos
    public Usuario dtoToPersona(UsuarioDto dto){
    Usuario persona = new Usuario();
    persona.setNombre(dto.getNombre());
    persona.setApellido(dto.getApellido());
    persona.setTitulo(dto.getTitulo());
    persona.setDescripcion(dto.getDescripcion());
    persona.setImg(dto.getImg());
    return persona;
    }
    
public UsuarioDto personaTodto(Usuario usuario){
    UsuarioDto dto = new UsuarioDto();
    dto.setId(usuario.getId());
    dto.setNombre(usuario.getNombre());
    dto.setApellido(usuario.getApellido());
    dto.setTitulo(usuario.getTitulo());
    dto.setDescripcion(usuario.getDescripcion());
    dto.setImg(usuario.getImg());
    return dto;
    
}    
}
