package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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

import com.example.demo.repository.model.Professor;
import com.example.demo.repository.persistence.ProfessorRepository;
import com.example.demo.service.ProfessorService;

@RestController
public class ProfessorController {
    
    public final ProfessorService professorService;
    public final ProfessorRepository professorRepository;


    public ProfessorController(ProfessorService professorService, ProfessorRepository professorRepository){
        this.professorService=professorService;
        this.professorRepository = professorRepository;
    }

    @PostMapping("/professorSalvar")
    public ResponseEntity<Professor> create(@RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.OK);
    }

    @GetMapping("/professorVer")
    public ResponseEntity<List<Professor>> verProfessor() {
        return new ResponseEntity<>(professorService.ver(), HttpStatus.OK);
    }
    @PutMapping("/professorAlterar")
    public ResponseEntity<Professor> alterarProfessor(@RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirProfessor(@PathVariable("id") Integer id) {
        professorService.excluir(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
