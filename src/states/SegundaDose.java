package states;

import models.Pessoa;

public class SegundaDose extends VacinaState {
	public static final String status = "HABILITADO PARA A SEGUNDA DOSE"
			;
	@Override
	public String atualizarEstado(Pessoa pessoa) {
		super.state = new SegundaDoseTomada();
		return status;
		
	}
	
	

	public String getStatus() {
		return status;
	}



	public SegundaDose() {
		
	}
}
