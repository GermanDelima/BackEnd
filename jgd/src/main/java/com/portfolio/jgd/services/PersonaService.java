
package com.portfolio.jgd.services;

import com.portfolio.jgd.models.Persona;
import com.portfolio.jgd.models.dtos.PersonaDto;
import com.portfolio.jgd.repositories.PersonaRepository;
import java.util.List;
import java.util.stream.Collectors;


import mappers.PersonaMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    private final  PersonaRepository repository;
    public PersonaService(PersonaRepository repository){
        this.repository = repository;
    }
    
    public PersonaDto crearPersona(PersonaDto persona){
        Persona per = repository.save(PersonaMapper.dtoToPersona(persona));
        return PersonaMapper.personaTodto(per);
    }
    
    public PersonaDto getPersonaById(Long id){
        Persona per = repository.findById(id).get();
        return PersonaMapper.personaTodto(per);
    } 
    
    public List<PersonaDto> getPersonas(){
    List<Persona> lista =  repository.findAll();
      return lista.stream()
                .map(PersonaMapper::personaTodto)
                .collect(Collectors.toList());
                
    }
    
    public PersonaDto editPersona(Long id, PersonaDto persona){
    if (repository.existsById(id)){
           Persona userToModify =  repository.findById(id).get();
           if (persona.getNombre() != null){
               userToModify.setNombre(persona.getNombre());
           }
           if (persona.getApellido() != null){
               userToModify.setApellido(persona.getApellido());
           }
           if (persona.getImg() != null){
               userToModify.setImg(persona.getImg());
           }
           
           repository.save(userToModify);
           return PersonaMapper.personaTodto(userToModify);

        }
        return null;
    }
    
    public String eliminar(Long id){
        if(repository.existsById(id)){
        repository.deleteById(id);
        return "La persona con el id: " + id + " se elimino";
        }else {
        return "Error al eliminar";
        }
    }

}
