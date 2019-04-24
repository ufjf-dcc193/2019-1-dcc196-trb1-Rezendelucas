package br.ufjf.dcc193.trabalho01.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Sede
 */

 @Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String estado;
    private String cidade;
    private String bairro;
    private String telefone;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Membro> membros;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Atividade> atividades;

    public Sede(){
        
    }

    public Sede(int id, String nome, String estado, String cidade, String bairro, String telefone, String email){
        this.nome = nome;
        this.id = id;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.email = email;
    }

    public List<Membro> getMembro(){
        return membros;
    }

    public List<Atividade> getAtividade(){
        return atividades;
    }

    public void setMembro(Membro m){
        membros.add(m);
    }

    public void setMembros(List<Membro> m){
        this.membros = m;
    }

    public void clearLista(){
        membros.clear();
    }

    public void setAtividade(Atividade a){
       this.atividades.add(a);
    }

    public void setAtividades(List<Atividade> a){
        this.atividades = a;
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
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
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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