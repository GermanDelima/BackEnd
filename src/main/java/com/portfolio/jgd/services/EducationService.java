package com.portfolio.jgd.services;

import com.portfolio.jgd.models.Education;
import com.portfolio.jgd.models.dtos.EducationDto;
import com.portfolio.jgd.repositories.EducationRepository;
import java.util.List;
import java.util.stream.Collectors;
import com.portfolio.jgd.mappers.EducationMapper;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

    public final EducationRepository repository;

    public EducationService(EducationRepository repository) {
        this.repository = repository;
    }

    public EducationDto crearEducation(EducationDto dto) {
        Education edu = repository.save(EducationMapper.dtoToEdu(dto));
        return EducationMapper.eduToDto(edu);
    }

    public EducationDto getEducationById(Long id) {
        if (repository.existsById(id)) {
            Education edu = repository.findById(id).get();
            return EducationMapper.eduToDto(edu);
        }
        return null;
    }

    public List<EducationDto> getEducations() {
        List<Education> lista = repository.findAll();
        return lista.stream()
                .map(EducationMapper::eduToDto)
                .collect(Collectors.toList());
    }

    public EducationDto editEducation(Long id, EducationDto dto) {
        if (repository.existsById(id)) {
            Education eduToModify = repository.findById(id).get();

            if (dto.getInstituto()!= null) {
                eduToModify.setInstituto(dto.getInstituto());
            }

            if (dto.getTitEdu() != null) {
                eduToModify.setTitEdu(dto.getTitEdu());
            }


            if (dto.getFechaInic() != null) {
                eduToModify.setFechaInic(dto.getFechaInic());
            }
            if (dto.getFechaFin() != null) {
                eduToModify.setFechaFin(dto.getFechaFin());
            }

            if (dto.getDescEduc() != null) {
                eduToModify.setDescEduc(dto.getDescEduc());
            }
            if (dto.getLogoCertificado() != null) {
                eduToModify.setLogoCertificado(dto.getLogoCertificado());
            }

            Education edu = repository.save(eduToModify);
            return EducationMapper.eduToDto(edu);

        }
        return null;
    }

    public EducationDto eliminar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);

        }
        return null;
    }

}
