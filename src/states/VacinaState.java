package states;

import models.Pessoa;

public abstract class VacinaState {
	
	protected VacinaState state;
	
	public VacinaState() {
		this.state =  null;
	}
	public abstract String atualizarEstado(Pessoa pessoa);
	public abstract String getStatus();
	
	

}
