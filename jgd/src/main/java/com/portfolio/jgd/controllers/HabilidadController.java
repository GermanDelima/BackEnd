package com.portfolio.jgd.controllers;

import com.portfolio.jgd.models.dtos.HabilidadDto;
import com.portfolio.jgd.models.dtos.ProyectoDto;
import com.portfolio.jgd.services.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HabilidadController {
  @Autowired
  public HabilidadService service;

  //CRUD
  //Create
  @PostMapping("/api/habilidad/crear/habilidad")
  public ResponseEntity<HabilidadDto> createHabilidad(@RequestBody HabilidadDto dto){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.createHabilidad(dto));
  }
  //Read
  @GetMapping("/api/habilidad/traer/habilidad")
  public ResponseEntity<List<HabilidadDto>> getByAllHabilidad(){
    List<HabilidadDto> lista = service.getHabilidades();
    return  ResponseEntity.status(HttpStatus.OK).body(lista);
  }
  //Update
  @PutMapping("/api/habilidad/editar/habilidad/{id}")
  public ResponseEntity<HabilidadDto> editHabilidad(@PathVariable Long id, @RequestBody HabilidadDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(service.editHabilidad(id, dto));
  }
  //Delete
  @DeleteMapping("/api/habilidad/eliminar/habilidad/{id}")
  public ResponseEntity<HabilidadDto> deleteHabilidad(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.deleteHabilidad(id));
  }
}
