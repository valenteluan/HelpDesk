package com.project.HelpDesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HelpDesk.domain.Chamado;
import com.project.HelpDesk.domain.Cliente;
import com.project.HelpDesk.domain.Tecnico;
import com.project.HelpDesk.domain.enums.Perfil;
import com.project.HelpDesk.domain.enums.Prioridade;
import com.project.HelpDesk.domain.enums.Status;
import com.project.HelpDesk.repositories.ChamadoRepository;
import com.project.HelpDesk.repositories.ClienteRepository;
import com.project.HelpDesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "6365320268", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeirp Chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
