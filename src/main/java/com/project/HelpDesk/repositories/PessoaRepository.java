package com.project.HelpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HelpDesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
