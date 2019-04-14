package br.ufjf.dcc193.trabalho01.model;

/**
 * Sede
 */
public class Sede {

    private int id;
    private String nome;
    private String unidadeFedativa;
    private String cidade;
    private String bairro;
    private String telefone;
    private String email;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the unidadeFedativa
     */
    public String getUnidadeFedativa() {
        return unidadeFedativa;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param unidadeFedativa the unidadeFedativa to set
     */
    public void setUnidadeFedativa(String unidadeFedativa) {
        this.unidadeFedativa = unidadeFedativa;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}