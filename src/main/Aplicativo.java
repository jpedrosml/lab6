package main;

import controller.Controller;
import states.PrimeiraDose;
import states.PrimeiraDoseTomada;
import states.SegundaDose;
import states.SegundaDoseTomada;
import states.VacinaState;

public class Aplicativo {
	
	private static VacinaState state;

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.cadastraPessoa("Victor", 15, "000.000.000-00", "Strawberry Road", "000000000", "victor@email", "0000-0000","estudante", "nao");
		System.out.println(controller.exibeCadastrado("000.000.000-00"));
		
		state = new PrimeiraDose();
		controller.atualizarEstado("000.000.000-00", state);
		System.out.println(controller.exibeCadastrado("000.000.000-00"));
		
		state = new PrimeiraDoseTomada();
		controller.atualizarEstado("000.000.000-00", state);
		System.out.println(controller.exibeCadastrado("000.000.000-00"));
		
		state = new SegundaDose();
		controller.atualizarEstado("000.000.000-00", state);
		System.out.println(controller.exibeCadastrado("000.000.000-00"));
		
		state = new SegundaDoseTomada();
		controller.atualizarEstado("000.000.000-00", state);
		System.out.println(controller.exibeCadastrado("000.000.000-00"));
		
		
		
		


	}

}
