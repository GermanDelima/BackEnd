package com.portfolio.jgd.controllers;

import com.portfolio.jgd.models.dtos.ProyectoDto;
import com.portfolio.jgd.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProyectoController {
  @Autowired
  public ProyectoService service;


  //crear una experiencia
  @PostMapping("/api/proyecto/crear/proyecto")
  public ResponseEntity<ProyectoDto> crearProyecto(@RequestBody ProyectoDto dto ){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.crearProyecto(dto));

  }

  @GetMapping("/api/proyecto/traer/proyecto/{id}")
  public ResponseEntity<ProyectoDto> getProyectoById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getProyectoById(id));
  }

  @GetMapping("/api/proyecto/traer/proyecto")
  public ResponseEntity<List<ProyectoDto>> getProyectos(){
    List<ProyectoDto> lista = service.getProyectos();
    return ResponseEntity.status(HttpStatus.OK).body(lista);
  }

  @PutMapping("/api/proyecto/editar/proyecto/{id}")
  public ResponseEntity<ProyectoDto> editProyecto(@PathVariable Long id, @RequestBody ProyectoDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editProyecto(id, dto));
  }

  @DeleteMapping("/api/proyecto/eliminar/proyecto/{id}")
  public ResponseEntity<ProyectoDto> eliminar(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.eliminar(id));

  }
}
