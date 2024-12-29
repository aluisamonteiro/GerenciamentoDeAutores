package model;

/**
 * Classe que representa um usuario do sistema
 * Contem as informacoes de login e senha do usuario
 */
public class Usuario {
    /**
     * Login do usuario
     */
    private String login;

    /**
     * Senha do usuario
     */
    private String senha;

    /**
     * Construtor da classe Usuario
     * 
     * @param login Login do usuario
     * @param senha Senha do usuario
     */
    public Usuario(String login, String senha) {
        super();
        this.login = login;
        this.senha = senha;
    }

    /**
     * Obtem o login do usuario
     * 
     * @return Login do usuario
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do usuario
     * 
     * @param login Novo login do usuario
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Obtem a senha do usuario
     * 
     * @return Senha do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuario
     * 
     * @param senha Nova senha do usuario
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
