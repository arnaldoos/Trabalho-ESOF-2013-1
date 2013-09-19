package br.ufu.facom.persim.model;

import java.sql.Timestamp;

public class Evento {
    
    private String local;
    private Timestamp dataHora;
    private Timestamp duracao;
    private String descricao;
        
    public Evento () {}
    
    public Evento (String local, Timestamp dataHora, Timestamp duracao, String descricao) {
        this.local = local;
        this.dataHora = dataHora;
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public Timestamp getDuracao() {
        return duracao;
    }

    public void setDuracao(Timestamp duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
