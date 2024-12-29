package controller;

import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Usuario;
/**
* Classe responsavel por controlar as operacoes relacionadas ao login dos usuarios
* Inclui funcionalidades para validar usuarios e limpar os campos de texto na interface grafica
*/
public class LoginController {

	/**
     	* Lista de usuarios cadastrados no sistema
     	*/
	private ArrayList<Usuario> usuarios;

	/**
     	* Construtor da classe LoginController
     	* Inicializa a lista de usuarios e adiciona usuarios administrativos padroes
     	* 
     	* @param usuarios Lista inicial de usuarios
     	*/
	public LoginController(ArrayList<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;

		Usuario adm1 = new Usuario("user", "12345");
        Usuario adm2 = new Usuario("admin", "1234");
		
	// Adiciona usuarios administrativos padroes
        this.usuarios.add(adm1);
        this.usuarios.add(adm2);
	}

	/**
     	* Valida se o login e senha fornecidos correspondem a um usuario cadastrado
     	* 
     	* @param txtLogin Campo de texto com o login fornecido pelo usuario
     	* @param txtSenha Campo de senha com a senha fornecida pelo usuario
     	* @return {@code true} se o login e senha forem validos, {@code false} caso contrario
     	*/
	public boolean validarUsuario(JTextField txtLogin, JPasswordField txtSenha) {
		String login, senha;
		login = txtLogin.getText();
		senha = String.valueOf(txtSenha.getPassword());

		// Percorre a lista de usuarios para validar as credenciais
		for(Usuario usuario: this.usuarios) {
			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}

	/**
     	* Limpa os campos de texto de login e senha na interface grafica
     	* 
     	* @param login Campo de texto do login
     	* @param senha Campo de senha
     	*/
	public void limparCampos(JTextField login, JPasswordField senha) {
		login.setText("");
		senha.setText("");
	}
}
