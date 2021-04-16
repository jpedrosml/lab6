package states;

import models.Pessoa;

public class PrimeiraDoseTomada extends VacinaState {

	public static final String status = "PRIMEIRA DOSE TOMADA. HABILITADO PARA A SEGUNDA";
	
	
	@Override
	public String atualizarEstado(Pessoa pessoa) {
		super.state = new SegundaDose();
		pessoa.setState(this);
		return  status;
		
	}
	
	public String getStatus() {
		return status;
	}

	public PrimeiraDoseTomada() {
		
	}
		
}
