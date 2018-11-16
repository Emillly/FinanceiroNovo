package br.edu.ifpb.esperanca.daw2.financeiro;

import java.util.ArrayList;
import java.util.List;

public class VariaveisBean {
	
	private List<Variaveis> variaveis = new ArrayList<Variaveis>();
	
	private Variaveis variavel;
	public VariaveisBean() {
		variavel = new Variaveis();
	}
	

	public Variaveis getVariaveis() {
		return variavel;
	}

	
	public Variaveis getVariavel() {
		return variavel;
	}


	public void setVariavel(Variaveis variavel) {
		this.variavel = variavel;
	}


	public void setVariaveis(List<Variaveis> variaveis) {
		this.variaveis = variaveis;
	}


	public void addVariavel() {
		variaveis.add(variavel);
		variavel = new Variaveis();
	}
	
	
	


	


	}



