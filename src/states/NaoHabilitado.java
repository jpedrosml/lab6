package states;

import models.Pessoa;

public class NaoHabilitado extends VacinaState {

	public static final String status = "NAO HABILITADO";
	
	public NaoHabilitado() {
		super.state = new PrimeiraDose();
	}
	
	@Override
	public String atualizarEstado(Pessoa pessoa) {
		if(pessoa.getIdade() >= 60 || pessoa.getComorbidade().equals("sim") || pessoa.getProfissao().equals("profissional da saude")) {
			pessoa.setState(super.state);
			return "Habilitado";
		}
		return  status;
	}

	public String getStatus() {
		return status;
	}

	
}
