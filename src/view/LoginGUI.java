package view;

import javax.swing.*;

/**
 * Classe responsável pela interface gráfica para login do sistema.
 * Contém campos de texto para login, senha e botões para limpar os campos ou entrar no sistema.
 */
public class LoginGUI extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnLimpar;

    /**
     * Construtor da classe LoginGUI.
     * Inicializa os componentes da interface gráfica e organiza os elementos na janela.
     */
    public LoginGUI() {
        setTitle("Login");
        setSize(350, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        // Configuração do rótulo e campo de login
        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(30, 30, 80, 20);
        add(lblLogin);

        txtLogin = new JTextField();
        txtLogin.setBounds(100, 30, 150, 20);
        add(txtLogin);

        // Configuração do rótulo e campo de senha
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 70, 80, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(100, 70, 150, 20);
        add(txtSenha);

        // Configuração do botão "LIMPAR"
        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(30, 120, 100, 30);
        add(btnLimpar);

        // Configuração do botão "ENTRAR"
        btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(150, 120, 100, 30);
        add(btnEntrar);

        // Configuraçao basica da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
