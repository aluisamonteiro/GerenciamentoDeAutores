package controller;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Autor;

/**
* Classe responsavel por controlar as operacoes relacionadas a autores
* Contem metodos para limpar campos, adicionar autores e validar os dados fornecidos
*/
public class AutorController {

	/**
     	* Lista de autores cadastrados.
     	*/
	ArrayList<Autor> autores;

	/**
     	* Construtor da classe AutorController
     	* 
     	* @param autores Lista de autores existentes no sistema
     	*/
	public AutorController(ArrayList<Autor> autores) {
		super();
		this.autores = autores;
	}

	/**
     	* Metodo para limpar os campos de texto da interface grafica
     	* 
     	* @param txtCodigo Campo de texto para o codigo
     	* @param txtNome Campo de texto para o nome
     	* @param txtEmail Campo de texto para o email
     	*/
	public void limpar(JTextField txtCodigo, JTextField txtNome,JTextField txtEmail) {
		txtCodigo.setText("");
		txtNome.setText("");
		txtEmail.setText("");
	}

	/**
     	* Metodo para adicionar um autor a lista de autores e a tabela
     	* Valida os campos e exibe mensagens de erro, se necessario
     	* 
     	* @param txtCodigo Campo de texto para o codigo
     	* @param txtNome Campo de texto para o nome
     	* @param txtEmail Campo de texto para o email
     	* @param cbTipoEscrita ComboBox com os tipos de escrita
     	* @param modelo Modelo da tabela para exibir os autores cadastrados
     	* @param container Container para exibir mensagens de dialogo
     	*/
	public void adicionarAutor(JTextField txtCodigo, 
			JTextField txtNome,
			JTextField txtEmail, 
			JComboBox<String> cbTipoEscrita,
			DefaultTableModel modelo,
			Container container) 
	{
		String nome, email, tipoEscrita;
		int codigo;

		// Obtem os valores dos campos
		nome = txtNome.getText();
		email = txtEmail.getText();
		tipoEscrita = (String) cbTipoEscrita.getSelectedItem();
		
		// Validacoes dos campos
		if(nome.isEmpty()) {
			JOptionPane.showMessageDialog(container, "Nome não pode estar vazio", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(email.isEmpty()) {
			JOptionPane.showMessageDialog(container, "Email não pode estar vazio", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(txtCodigo.getText().equals("")) {
			JOptionPane.showMessageDialog(container, "Codigo não pode estar vazio", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		try {			

			// Converte o codigo para um numero inteiro
			codigo = Integer.valueOf(txtCodigo.getText());

			// Verifica se o codigo ja existe
			for(Autor autor: autores) {
				if(autor.getCodigo() == codigo) {
					JOptionPane.showMessageDialog(container, "Codigo ja existente", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}

			// Cria um novo autor e adiciona a lista
			Autor autor = new Autor(codigo, nome, email, tipoEscrita);
			Object[] dadosAutor = {autor.getCodigo(), autor.getNome(), autor.getEmail(), autor.getTipoEscrita()};
			modelo.addRow(dadosAutor);
			this.autores.add(autor);
			JOptionPane.showMessageDialog(container, "Autor cadastrado com sucesso!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {

			// Trata erros de conversao do codigo
			JOptionPane.showMessageDialog(container, "Codigo tem que ser um numero", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
