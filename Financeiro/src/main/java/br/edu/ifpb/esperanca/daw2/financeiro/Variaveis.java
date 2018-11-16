package br.edu.ifpb.esperanca.daw2.financeiro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Variaveis implements Identificavel {
	
	@Id
	@GeneratedValue(generator="var_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="var_seq")
	private Long idVariavel;
	
	
	private int rendaVariavel;
	private int despesavariavel;
	
	public int getRendaVariavel() {
		return rendaVariavel;
	}
	public void setRendaVariavel(int rendaVariavel) {
		this.rendaVariavel = rendaVariavel;
	}
	public int getDesdesavariavel() {
		return despesavariavel;
	}
	public void setDesdesavariavel(int desdesavariavel) {
		this.despesavariavel = desdesavariavel;
	}
	
	
	@Override
	public Long getId() {
		return idVariavel;
	}
	@Override
	public void setId(Long id) {
		this.idVariavel = id;
		


}
}