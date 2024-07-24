package com.portfolio.jgd.controllers;

import com.portfolio.jgd.models.dtos.SobremiDto;
import com.portfolio.jgd.services.SobremiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class SobremiController {
  @Autowired
  public SobremiService service;

  @PostMapping("/api/sobremi/crear/sobremi")
  public ResponseEntity<SobremiDto> createSobremi(@RequestBody SobremiDto dto){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.createSobremi(dto));
  }

  @GetMapping("/api/sobremi/traer/sobremi")
  public ResponseEntity<List<SobremiDto>> getSobremiAll(){
    List<SobremiDto> lista = service.getSobremiAll();
    return ResponseEntity.status(HttpStatus.OK).body(lista);
  }

  @GetMapping("/api/sobremi/traer/sobremi/{id}")
  public ResponseEntity<SobremiDto> getSobremiById(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.getSobremiById(id));
  }

  @PutMapping("/api/sobremi/editar/sobremi/{id}")
  public ResponseEntity<SobremiDto> editSobremi(@PathVariable Long id, @RequestBody SobremiDto dto){
   return ResponseEntity.status(HttpStatus.OK).body(service.editSobremi(id,dto));
  }

  @DeleteMapping("/api/sobremi/eliminar/sobremi/{id}")
  public ResponseEntity<String> deleteSobremi(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.deleteSobremi(id));
  }
}
