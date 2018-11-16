package br.edu.ifpb.esperanca.daw2.financeiro;

public class Despesas {
	 private String despesas_fixas;
	 private String despesas_Variaveis;
	 private int valor_DesFixas;
	 private int valor_DesVariaveis;
	 private int id_despesas;
	public String getDespesas_fixas() {
		return despesas_fixas;
	}
	public void setDespesas_fixas(String despesas_fixas) {
		this.despesas_fixas = despesas_fixas;
	}
	public String getDespesas_Variaveis() {
		return despesas_Variaveis;
	}
	public void setDespesas_Variaveis(String despesas_Variaveis) {
		this.despesas_Variaveis = despesas_Variaveis;
	}
	public int getValor_DesFixas() {
		return valor_DesFixas;
	}
	public void setValor_DesFixas(int valor_DesFixas) {
		this.valor_DesFixas = valor_DesFixas;
	}
	public int getValor_DesVariaveis() {
		return valor_DesVariaveis;
	}
	public void setValor_DesVariaveis(int valor_DesVariaveis) {
		this.valor_DesVariaveis = valor_DesVariaveis;
	}
	public int getId_despesas() {
		return id_despesas;
	}
	public void setId_despesas(int id_despesas) {
		this.id_despesas = id_despesas;
	}
	 
}
