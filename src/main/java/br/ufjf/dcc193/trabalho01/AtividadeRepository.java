package br.ufjf.dcc193.trabalho01;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.trabalho01.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

    
}