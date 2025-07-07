package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.model.Professor;
import com.example.demo.repository.persistence.ProfessorRepository;

@Service
public class ProfessorService {
 
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository){
        this.professorRepository=professorRepository;
    }

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

}
