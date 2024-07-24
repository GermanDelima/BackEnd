
package com.portfolio.jgd.services;

import com.portfolio.jgd.models.Diploma;
import com.portfolio.jgd.models.dtos.DiplomaDto;
import com.portfolio.jgd.repositories.DiplomaRepository;
import java.util.List;
import java.util.stream.Collectors;
import com.portfolio.jgd.mappers.DiplomaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Josías de Lima
 * 
 * 
 */
@Service
public class DiplomaService {
@Autowired
    private DiplomaRepository repository;

  public DiplomaDto crearExpe(DiplomaDto dto) {
    Diploma diploma = repository.save(DiplomaMapper.dtoToExpe(dto));
    return DiplomaMapper.expeToDto(diploma);
  }

    public List<DiplomaDto> getExperiencias() {
       List<Diploma> lista = repository.findAll();
          return lista.stream()
                    .map(DiplomaMapper::expeToDto)
                    .collect(Collectors.toList());
    }


  public DiplomaDto getExperienciaById(Long id) {
    if (repository.existsById(id)){
     Diploma diploma = repository.findById(id).get();
     return DiplomaMapper.expeToDto(diploma);
    }

    return null;
  }


  public DiplomaDto editExperiencia(Long id, DiplomaDto dto) {
    if (repository.existsById(id)){
     Diploma expeToModify = repository.findById(id).get();
     Diploma diploma = repository.save(expeToModify);
    return DiplomaMapper.expeToDto(diploma);
    }
    return null;
  }


  public DiplomaDto eliminar(Long id) {
    if (repository.existsById(id)){
      repository.deleteById(id);
    }
    return null;
  }
}
