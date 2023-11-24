package com.project.HelpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HelpDesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
