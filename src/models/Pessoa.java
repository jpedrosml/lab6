package models;
import states.NaoHabilitado;
import states.PrimeiraDose;
import states.VacinaState;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String cpf;
	private String endereco;
	private String numeroCartaoSus;
	private String email;
	private String telefone;
	private String profissao;
	private String comorbidade;
	protected VacinaState state;
	
	public Pessoa(String nome, Integer idade, String cpf, String endereco, String numeroCartaoSus, String email, String telefone,
			String profissao, String comorbidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numeroCartaoSus = numeroCartaoSus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.state = new NaoHabilitado();
	}
	
	public String estado() {
		return this.state.atualizarEstado(this);
	}
	
	public String getStatus() {
		return this.state.getStatus();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumeroCartaoSus() {
		return numeroCartaoSus;
	}
	
	public void setNumeroCartaoSus(String numeroCartaoSus) {
		this.numeroCartaoSus = numeroCartaoSus;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getComorbidade() {
		return comorbidade;
	}
	
	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}
	
	public VacinaState getState() {
		return state;
	}

	public void setState(VacinaState state) {
		this.state = state;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comorbidade == null) ? 0 : comorbidade.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCartaoSus == null) ? 0 : numeroCartaoSus.hashCode());
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (comorbidade == null) {
			if (other.comorbidade != null)
				return false;
		} else if (!comorbidade.equals(other.comorbidade))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCartaoSus == null) {
			if (other.numeroCartaoSus != null)
				return false;
		} else if (!numeroCartaoSus.equals(other.numeroCartaoSus))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEndereco: " + endereco
				+ "\nCartao SUS: " + numeroCartaoSus + "\nE-mail: " + email + "\nTelefone: " + telefone
				+ "\nProfissao: " + profissao + "\nComorbidades: " + comorbidade + "\nStatus: " + estado() + "\n";
	}
	
}
