
package com.portfolio.jgd.controllers;

import com.portfolio.jgd.models.dtos.DiplomaDto;
import com.portfolio.jgd.services.DiplomaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josías de Lima
 * 
 * 
 */
@RestController
public class DiplomaController {
    @Autowired
    private DiplomaService service;
    
    //crear una experiencia
      @PostMapping("/api/diploma/crear/diploma")
      public ResponseEntity<DiplomaDto> crearExpe(@RequestBody DiplomaDto dto ){
          return ResponseEntity.status(HttpStatus.CREATED).body(service.crearExpe(dto));
      
      }
      
    @GetMapping("/api/diploma/traer/diploma/{id}")
    public ResponseEntity<DiplomaDto> getExperienciaById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getExperienciaById(id));
    }
    
    @GetMapping("/api/diploma/traer/diploma")
    public ResponseEntity<List<DiplomaDto>> getExperiencias(){
        List<DiplomaDto> lista = service.getExperiencias();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    
        @PutMapping("/api/diploma/editar/diploma/{id}")
    public ResponseEntity<DiplomaDto> editExperiencia(@PathVariable Long id, @RequestBody DiplomaDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editExperiencia(id, dto));
    }
    
    @DeleteMapping("/api/diploma/eliminar/diploma/{id}")
    public ResponseEntity<DiplomaDto> eliminar(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.eliminar(id));
    
    }

}
