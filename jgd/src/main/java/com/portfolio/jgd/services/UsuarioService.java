package com.portfolio.jgd.services;

import com.portfolio.jgd.models.Usuario;
import com.portfolio.jgd.models.dtos.UsuarioDto;
import java.util.List;
import java.util.stream.Collectors;

import mappers.UsuarioMapper;
import org.springframework.stereotype.Service;
import com.portfolio.jgd.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioService {
@Autowired
    private  UsuarioRepository repository;
   

    public UsuarioDto crearUsuario(UsuarioDto persona) {
        Usuario per = repository.save(UsuarioMapper.dtoToPersona(persona));
        return UsuarioMapper.personaTodto(per);
    }

    public UsuarioDto getUsuarioById(Long id) {
        Usuario per = repository.findById(id).get();
        return UsuarioMapper.personaTodto(per);
    }

    public List<UsuarioDto> getUsuarios() {
        List<Usuario> lista = repository.findAll();
        return lista.stream()
                .map(UsuarioMapper::personaTodto)
                .collect(Collectors.toList());

    }

    public UsuarioDto editUsuario(Long id, UsuarioDto persona) {
        if (repository.existsById(id)) {
            Usuario userToModify = repository.findById(id).get();
            if (persona.getNombre() != null) {
                userToModify.setNombre(persona.getNombre());
            }
            if (persona.getApellido() != null) {
                userToModify.setApellido(persona.getApellido());
            }
            if (persona.getImg() != null) {
                userToModify.setImg(persona.getImg());
            }

            if (persona.getTitulo() != null) {
                userToModify.setTitulo(persona.getTitulo());
            }
            if (persona.getDescripcion() != null) {
                userToModify.setDescripcion(persona.getDescripcion());
            }

            Usuario p = repository.save(userToModify);
            return UsuarioMapper.personaTodto(p);

        }
        return null;
    }

    public String eliminar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "La persona con el id: " + id + " se elimino";
        } else {
            return "Error al eliminar";
        }
    }

}
