package com.project.HelpDesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HelpDesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
