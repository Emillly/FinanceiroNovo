package br.edu.ifpb.esperanca.daw2.financeiro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Usuario implements Identificavel {

	@Id
	@GeneratedValue(generator="usuario_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="usuario_seq")
	private Long id_cpf;

	private String nome;
	private int idade;
	private float despesafixa;
	private float salariofixo;
	private float resultado;
	private String endereco;
	private String username; 
	private String password;
	private String grupo;
		
	

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public float getSalariofixo() {
		return salariofixo;
	}

	public void setSalariofixo(float salariofixo) {
		this.salariofixo = salariofixo;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getDespesafixa() {
		return despesafixa;
	}

	public void setDespesafixa(float despesafixa) {
		this.despesafixa = despesafixa;
	}
	
	@Override
	public Long getId() {
		return id_cpf;
	}
	
	@Override
	public void setId(Long id) {
		this.id_cpf = id;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
