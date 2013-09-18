/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.model;

/**
 *
 * @author Ricardo & Ludma
 */
public class Reunioes {
    private String descricao;
    private String dia;
    
    public Reunioes(){}
    
    public Reunioes(String descricao, String dia)
    {
        this.descricao=descricao;
        this.dia=dia;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao=descricao;
    }
    
    public String getDecricao()
    {
        return descricao;
    }
    
    public void setDia(String dia)
    {
        this.dia = dia;
    }
    
    public String getDia()
    {
        return dia;
    }

}
