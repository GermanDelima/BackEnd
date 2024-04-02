
package com.portfolio.jgd.controllers;


import com.portfolio.jgd.models.dtos.PersonaDto;
import com.portfolio.jgd.services.PersonaService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    private final PersonaService service;
    public PersonaController(PersonaService service){
        this.service = service;
    }
    
    //crear persona
    //traer persona
    //traer lista de persona
    //editar persona
    //eliminar persona
    
    @PostMapping("/crear/perfil")
    public ResponseEntity<PersonaDto> crearPersona(@RequestBody PersonaDto persona){
    return ResponseEntity.status(HttpStatus.OK).body(service.crearPersona(persona));
    }
    @GetMapping("/traer/perfil/{id}")
    public ResponseEntity<PersonaDto> getPersonaById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getPersonaById(id));
    }
    @GetMapping("/traer/perfil")
    public ResponseEntity<List<PersonaDto>> getPersonas(){
        List<PersonaDto> lista = service.getPersonas();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @PutMapping("/editar/perfil/{id}")
    public ResponseEntity<PersonaDto> editPersona(@PathVariable Long id, @RequestBody PersonaDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editPersona(id, dto));
    }
    @DeleteMapping("/eliminar/perfil/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.eliminar(id));
    
    }
    
}
