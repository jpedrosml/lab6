package states;

import models.Pessoa;

public class SegundaDoseTomada extends VacinaState {
	public static final String status = "IMUNIZADO";
	
	@Override
	public String atualizarEstado(Pessoa pessoa) {
		return status;
		
	}
	
	public String getStatus() {
		return status;
	}

	public SegundaDoseTomada() {
		
	}
		
}
