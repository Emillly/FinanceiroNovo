package br.edu.ifpb.esperanca.daw2.financeiro;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped

public class UsuarioBean {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	private Usuario usuario;
	public UsuarioBean() {
		usuario = new Usuario();
	}
	

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void addUsuario() {
		usuarios.add(usuario);
		usuario = new Usuario();
	
	}
	

	public void removeUsuario(int id_cpf) {
		for (Usuario usuario : usuarios) {
			if(usuario.getId_cpf() == id_cpf) {
				usuarios.remove(usuario);
				return;
			}
		}
	


	}
}
