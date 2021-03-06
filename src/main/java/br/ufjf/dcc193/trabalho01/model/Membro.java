package br.ufjf.dcc193.trabalho01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Membro
 */
@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String funcao;
    private String email;
    private String entrada;
    private String saida;

    public Membro(){

    }

    public Membro(int id,String nome, String funcao, String email, String entrada, String saida){
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.entrada = entrada;
        this.saida = saida;
    }
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
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @return the saida
     */
    public String getSaida() {
        return saida;
    }

    /**
     * @param id the id to set
    */
    public void setId(int id) {
        this.id = id;
}

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @param saida the saida to set
     */
    public void setSaida(String saida) {
        this.saida = saida;
    }
    
}