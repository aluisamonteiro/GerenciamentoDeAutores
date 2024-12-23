package view;

import javax.swing.*;

public class LoginGUI extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnLimpar;

    public LoginGUI() {
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
        btnLimpar.setBounds(30, 120, 100, 30);
        add(btnLimpar);

        btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(150, 120, 100, 30);
        add(btnEntrar);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
