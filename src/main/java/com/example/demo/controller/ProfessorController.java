package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.Professor;
import com.example.demo.service.ProfessorService;

@RestController
public class ProfessorController {
    
    public final ProfessorService professorService;


    public ProfessorController(ProfessorService professorService){
        this.professorService=professorService;
    }

    @PostMapping("/professorSalvar")
    public ResponseEntity<Professor> create(@RequestBody Professor professor) {
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.OK);
    }

}
