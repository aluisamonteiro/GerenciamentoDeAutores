package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AutorGUI extends JFrame {
	private JTextField txtCodigo, txtNome, txtEmail;
    private JComboBox<String> cbTipoEscrita;
    private JButton btnLimpar, btnEnviar;
    private JTable tabela;
    private DefaultTableModel modelo;

    public AutorGUI() {
        setTitle("Cadastro de Autores");
        setSize(500, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código");
        lblCodigo.setBounds(30, 30, 80, 20);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(100, 30, 150, 20);
        add(txtCodigo);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(30, 60, 80, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 60, 150, 20);
        add(txtNome);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(30, 90, 80, 20);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 90, 150, 20);
        add(txtEmail);

        JLabel lblTipo = new JLabel("Tipo de Escrita:");
        lblTipo.setBounds(30, 120, 100, 20);
        add(lblTipo);

        cbTipoEscrita = new JComboBox<>(new String[]{"Literatura Infantil", "Literatura Juvenil", "Literatura Adulta"});
        cbTipoEscrita.setBounds(150, 120, 150, 20);
        add(cbTipoEscrita);

        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(50, 170, 100, 30);
        add(btnLimpar);

        btnEnviar = new JButton("ENVIAR");
        btnEnviar.setBounds(200, 170, 100, 30);
        add(btnEnviar);

        // Achei interessante exibir os dados por meio de uma estrutura de tabela
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Email");
        modelo.addColumn("Tipo de Escrita");

        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(30, 220, 400, 120);
        add(scrollPane);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
