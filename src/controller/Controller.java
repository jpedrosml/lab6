package controller;
import java.util.HashMap; 

import models.Pessoa;
import states.VacinaState;

public class Controller {
	HashMap<String, Pessoa> pessoas;

	public Controller() {
		this.pessoas = new HashMap<>();
	}
	
	public void cadastraPessoa(String nome, Integer idade, String cpf, String endereco, String numeroCartaoSus, String email, String telefone, String profissao, String comorbidade) {
		Pessoa pessoa = new Pessoa(nome, idade, cpf, endereco, numeroCartaoSus, email, telefone, profissao, comorbidade);
		this.pessoas.put(cpf, pessoa);
	}
	
	public void editarEmail(String cpf, String email){
		if (this.pessoas.containsKey(cpf)) {
			pessoas.get(cpf).setEmail(email);
		} else {
			throw new IllegalArgumentException("Pessoa nao cadastrada");
		}
	}
	
	public void editarTelefone(String cpf, String telefone) {
		if (this.pessoas.containsKey(cpf)) {
			pessoas.get(cpf).setTelefone(telefone);
		}
	}
	
	public String exibeCadastrado(String cpf) {
		if(this.pessoas.containsKey(cpf)) {
			return pessoas.get(cpf).toString();
		}
		return "Nao cadastrado.";
	}
	
	public void atualizarEstado(String cpf, VacinaState state) {
		if(this.pessoas.containsKey(cpf)) {
			if(this.pessoas.get(cpf).getStatus().equals("IMUNIZADO")){
				throw new IllegalArgumentException("Imunizado");
			}
			this.pessoas.get(cpf).setState(state);
		}
		
	}
	
	
}
