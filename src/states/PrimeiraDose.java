package states;

import models.Pessoa;

public class PrimeiraDose extends VacinaState {
	
	public static final String status = "HABILITADO PARA PRIMEIRA DOSE";
	
	@Override
	public String atualizarEstado(Pessoa pessoa) {
		super.state = new PrimeiraDoseTomada();
		pessoa.setState(this);
		return status;
		
	}

	public String getStatus() {
		return status;
	}
	
	public PrimeiraDose() {
		
	}
}
