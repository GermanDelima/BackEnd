
package com.portfolio.jgd.controllers;


import com.portfolio.jgd.models.dtos.UsuarioDto;
import com.portfolio.jgd.services.UsuarioService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService service;
    public UsuarioController(UsuarioService service){
        this.service = service;
    }
    
    //crear persona
    //traer persona
    //traer lista de persona
    //editar persona
    //eliminar persona
    
    @PostMapping("/api/usuario/crear/perfil")
    public ResponseEntity<UsuarioDto> crearPersona(@RequestBody UsuarioDto usuario){
    return ResponseEntity.status(HttpStatus.OK).body(service.crearUsuario(usuario));
    }
    @GetMapping("/api/usuario/traer/perfil/{id}")
    public ResponseEntity<UsuarioDto> getPersonaById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getUsuarioById(id));
    }
    @GetMapping("/api/usuario/traer/perfil")
    public ResponseEntity<List<UsuarioDto>> getPersonas(){
        List<UsuarioDto> lista = service.getUsuarios();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @PutMapping("/api/usuario/editar/perfil/{id}")
    public ResponseEntity<UsuarioDto> editPersona(@PathVariable Long id, @RequestBody UsuarioDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editUsuario(id, dto));
    }
    @DeleteMapping("/api/usuario/eliminar/perfil/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.eliminar(id));
    
    }
    
}
