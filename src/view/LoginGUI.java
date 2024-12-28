package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.LoginController;
import model.Usuario;

/**
* Classe responsavel pela interface grafica para login do sistema
* Contem campos de texto para login, senha e botoes para limpar os campos ou entrar no sistema
* Inclui integracao com o controlador {@link LoginController} para validacao e manipulacao dos dados
*/
public class LoginGUI extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnLimpar;

    /**
    * Controlador para validacao do login
    */
    private LoginController loginController;

    /**
    * Construtor da classe LoginGUI
    * Inicializa os componentes da interface grafica e organiza os elementos na janela
    */
    public LoginGUI() {
        
        // Instancia do controller de login
        loginController = new LoginController(new ArrayList<Usuario>());

        setTitle("Login");
        setSize(350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        // Configuracao do rotulo e campo de login
        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(30, 30, 80, 20);
        add(lblLogin);

        txtLogin = new JTextField();
        txtLogin.setBounds(100, 30, 150, 20);
        add(txtLogin);

        // Configuracao do rotulo e campo de senha
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 70, 80, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(100, 70, 150, 20);
        add(txtSenha);

        // Configuracao do botao "LIMPAR"
        btnLimpar = new JButton("LIMPAR");
        
        /**
        * Acao do botao "LIMPAR":
        * Limpa os campos de login e senha utilizando o metodo do {@link LoginController}
        */
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginController.limparCampos(txtLogin, txtSenha);
            }
        });

        btnLimpar.setBounds(30, 120, 100, 30);
        add(btnLimpar);

        // Configuracao do botao "ENTRAR"
        btnEntrar = new JButton("ENTRAR");
        
        /**
        * Acao do botao "ENTRAR":
        * Valida o usuario utilizando o metodo do {@link LoginController}
        * Exibe mensagens de erro ou sucesso e redireciona para a tela de cadastro {@link AutorGUI}
        */
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (loginController.validarUsuario(txtLogin, txtSenha)) {
                    dispose();
                    JOptionPane.showMessageDialog(getContentPane(), "Bem-vindo " + txtLogin.getText() + "!", "Usuário logado", JOptionPane.INFORMATION_MESSAGE);
                    new AutorGUI();
                } else {
                    JOptionPane.showMessageDialog(getContentPane(), "Usuário não encontrado. Tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnEntrar.setBounds(150, 120, 100, 30);
        add(btnEntrar);

        // Configuracao basica da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
    * Metodo principal para executar a interface grafica de login
    * 
    * @param args Argumentos da linha de comando
    */
    public static void main(String[] args) {
        new LoginGUI();
    }
}
