package controller;

import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Usuario;

public class LoginController {
	private ArrayList<Usuario> usuarios;
	
	public LoginController(ArrayList<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
		
		Usuario adm1 = new Usuario("user", "12345");
        Usuario adm2 = new Usuario("admin", "1234");
        this.usuarios.add(adm1);
        this.usuarios.add(adm2);
	}

	public boolean validarUsuario(JTextField txtLogin, JPasswordField txtSenha) {
		String login, senha;
		login = txtLogin.getText();
		senha = String.valueOf(txtSenha.getPassword());
		
		for(Usuario usuario: this.usuarios) {
			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
	public void limparCampos(JTextField login, JPasswordField senha) {
		login.setText("");
		senha.setText("");
	}
}
