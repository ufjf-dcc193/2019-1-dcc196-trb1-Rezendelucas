package br.ufjf.dcc193.trabalho01;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.trabalho01.model.Membro;

public interface MembroRepository extends JpaRepository<Membro, Integer>{

    
}