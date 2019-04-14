package br.ufjf.dcc193.trabalho01.model;

/**
 * Atividade
 */
public class Atividade {

public enum Categoria{
    ASSISTENCIAL,
    JURIDICO,
    FINANCEIRA,
    EXECULTIVO
}

    private int id;
    private String titulo;
    private String descricao;
    private String inicio;
    private String fim;
    private String total;
    private Categoria categoria; 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @return the fim
     */
    public String getFim() {
        return fim;
    } 

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(String fim) {
        this.fim = fim;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}