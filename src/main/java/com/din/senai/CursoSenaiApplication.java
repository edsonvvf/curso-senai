package com.din.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.din.senai.domain.Cliente;
import com.din.senai.domain.Estado;
import com.din.senai.domain.enuns.Tipocliente;
import com.din.senai.repositories.ClienteRepository;
import com.din.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		estadoRepository.saveAll(Arrays.asList(est1, est2));

		Cliente cli1 = new Cliente(null, "Crispim Luiz ", "12345678910", "c.luiz@fiemg.com.br",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345678", "3412345679"));
		clienteRepository.saveAll(Arrays.asList(cli1));

		Cliente cli2 = new Cliente(null, "Pedro cunha", "12345678911", "Pedrão@hotmail.com", Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345672", "3412345676"));
		clienteRepository.saveAll(Arrays.asList(cli2));

		Cliente cli3 = new Cliente(null, "Caio silva", "12345678912", "caião@hotmail.com", Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345675", "3412345671"));
		clienteRepository.saveAll(Arrays.asList(cli3));

		Cliente cli4 = new Cliente(null, "Guilherme araujo", "12345678913", "Guilhermão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345674", "3412345679"));
		clienteRepository.saveAll(Arrays.asList(cli4));

		Cliente cli5 = new Cliente(null, "Alan augusto", "12345678914", "Al," + "0ão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345677", "3412345678"));
		clienteRepository.saveAll(Arrays.asList(cli5));

		Cliente cli6 = new Cliente(null, "Antony limera", "12345678915", "Antonão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345633", "3412345622"));
		clienteRepository.saveAll(Arrays.asList(cli6));

		Cliente cli7 = new Cliente(null, "Eduardo oliveira", "12345678916", "Eduardão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345666", "3412345611"));
		clienteRepository.saveAll(Arrays.asList(cli7));

		Cliente cli8 = new Cliente(null, "Thomas Turbano", "12345678917", "Tonão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345644", "3412345655"));
		clienteRepository.saveAll(Arrays.asList(cli8));

		Cliente cli9 = new Cliente(null, "Tilambo cano", "12345678918", "Tilambão@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345699", "3412345688"));
		clienteRepository.saveAll(Arrays.asList(cli9));

		Cliente cli10 = new Cliente(null, "Richard selvagem", "12345678919", "Richardinho@hotmail.com",
				Tipocliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3412345665", "3412345677"));
		clienteRepository.saveAll(Arrays.asList(cli10));

	}

}
