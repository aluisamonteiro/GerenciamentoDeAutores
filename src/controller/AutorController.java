package controller;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Autor;

public class AutorController {
	
	ArrayList<Autor> autores;
	
	public AutorController(ArrayList<Autor> autores) {
		super();
		this.autores = autores;
	}

	public void limpar(JTextField txtCodigo, JTextField txtNome,JTextField txtEmail) {
		txtCodigo.setText("");
		txtNome.setText("");
		txtEmail.setText("");
	}
	
	public void adicionarAutor(JTextField txtCodigo, 
			JTextField txtNome,
			JTextField txtEmail, 
			JComboBox<String> cbTipoEscrita,
			DefaultTableModel modelo,
			Container container) 
	{
		String nome, email, tipoEscrita;
		int codigo;
		nome = txtNome.getText();
		email = txtEmail.getText();
		tipoEscrita = (String) cbTipoEscrita.getSelectedItem();
		
		
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
			
			codigo = Integer.valueOf(txtCodigo.getText());
			
			for(Autor autor: autores) {
				if(autor.getCodigo() == codigo) {
					JOptionPane.showMessageDialog(container, "Codigo ja existente", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
			
			Autor autor = new Autor(codigo, nome, email, tipoEscrita);
			Object[] dadosAutor = {autor.getCodigo(), autor.getNome(), autor.getEmail(), autor.getTipoEscrita()};
			modelo.addRow(dadosAutor);
			this.autores.add(autor);
			JOptionPane.showMessageDialog(container, "Autor cadastrado com sucesso!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(container, "Codigo tem que ser um numero", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}