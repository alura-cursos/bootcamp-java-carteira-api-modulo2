package br.com.alura.carteira.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.modelo.Transacao;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

	private List<Transacao> transacoes = new ArrayList<>();

	@GetMapping
	public List<Transacao> listar() {
		return transacoes;
	}

	@PostMapping
	public void cadastrar(@RequestBody Transacao transacao) {
		transacoes.add(transacao);
	}

}
