package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.LoginController;
import model.Usuario;

public class LoginGUI extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnLimpar;
//    declaração da variavel do controller
    private LoginController loginController;

    public LoginGUI() {
//    	instância do controller de login
    	loginController = new LoginController(new ArrayList<Usuario>());
    	
        setTitle("Login");
        setSize(350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(30, 30, 80, 20);
        add(lblLogin);

        txtLogin = new JTextField();
        txtLogin.setBounds(100, 30, 150, 20);
        add(txtLogin);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 70, 80, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(100, 70, 150, 20);
        add(txtSenha);

        btnLimpar = new JButton("LIMPAR");
//        funcionalidade para limpar campos
        btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loginController.limparCampos(txtLogin, txtSenha);
			}
		});
        
        btnLimpar.setBounds(30, 120, 100, 30);
        add(btnLimpar);

        btnEntrar = new JButton("ENTRAR");
//        funcionalidade para validar usuario
        btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(loginController.validarUsuario(txtLogin, txtSenha)) {
					dispose();
					JOptionPane.showMessageDialog(getContentPane(), "Bem vindo " + txtLogin.getText() + "!", "Usuario logado", JOptionPane.INFORMATION_MESSAGE);
					new AutorGUI();
				} else {
					JOptionPane.showMessageDialog(getContentPane(), "Usuário não encontrado. Tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
        btnEntrar.setBounds(150, 120, 100, 30);
        add(btnEntrar);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
