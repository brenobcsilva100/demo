package com.example.demo.service;

import java.util.List;

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

    public List<Professor> ver() {
        return professorRepository.findAll();
    }

    public void excluir(int id) {
        professorRepository.deleteById(id);
    }

}
