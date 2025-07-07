package com.example.demo.repository.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repository.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
    
}
