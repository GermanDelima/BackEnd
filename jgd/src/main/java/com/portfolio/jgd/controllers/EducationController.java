
package com.portfolio.jgd.controllers;

import com.portfolio.jgd.models.dtos.EducationDto;
import com.portfolio.jgd.services.EducationService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {
   
    private final EducationService service;
    public EducationController(EducationService service){
    this.service = service;
    }
   
    @PostMapping("/api/education/crear/education")
    public ResponseEntity<EducationDto> crearEducation(@RequestBody EducationDto education){
    return ResponseEntity.status(HttpStatus.OK).body(service.crearEducation(education));
    }
    
    @GetMapping("/api/education/traer/education/{id}")
    public ResponseEntity<EducationDto> getEducationById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getEducationById(id));
    }
    @GetMapping("/api/education/traer/educations")
    public ResponseEntity<List<EducationDto>> getEducations(){
        List<EducationDto> lista = service.getEducations();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @PutMapping("/api/education/editar/education/{id}")
    public ResponseEntity<EducationDto> editEducation(@PathVariable Long id, @RequestBody EducationDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editEducation(id, dto));
    }
    
    @DeleteMapping("/api/education/eliminar/education/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.eliminar(id));
    
    }

}
