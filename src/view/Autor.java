/**
 * Classe que representa um autor no sistema de gerenciamento de autores
 */
public class Autor {
    /**
     * Codigo único do autor
     */
    private int codigo;

    /**
     * Nome do autor
     */
    private String nome;

    /**
     * Email do autor
     */
    private String email;

    /**
     * Tipo de escrita do autor (Literatura Infantil, Literatura Juvenil, Literatura Adulta)
     */
    private String tipoEscrita;

    /**
     * Construtor para criar um autor com todos os atributos.
     * 
     * @param codigo      Código único do autor.
     * @param nome        Nome do autor.
     * @param email       Email do autor.
     * @param tipoEscrita Tipo de escrita do autor.
     */
    public Autor(int codigo, String nome, String email, String tipoEscrita) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.tipoEscrita = tipoEscrita;
    }

    /**
     * Obtém o código do autor.
     * 
     * @return Código do autor.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do autor.
     * 
     * @param codigo Novo código do autor.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o nome do autor.
     * 
     * @return Nome do autor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do autor.
     * 
     * @param nome Novo nome do autor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o email do autor.
     * 
     * @return Email do autor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do autor.
     * 
     * @param email Novo email do autor.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o tipo de escrita do autor.
     * 
     * @return Tipo de escrita do autor.
     */
    public String getTipoEscrita() {
        return tipoEscrita;
    }

    /**
     * Define o tipo de escrita do autor.
     * 
     * @param tipoEscrita Novo tipo de escrita do autor.
     */
    public void setTipoEscrita(String tipoEscrita) {
        this.tipoEscrita = tipoEscrita;
    }
}
