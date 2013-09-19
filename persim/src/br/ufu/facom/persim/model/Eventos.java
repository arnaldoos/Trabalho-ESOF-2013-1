/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package br.ufu.facom.persim.model;

/**
*
* @author Ricardo & Ludma
*/
public class Eventos {
    private String descricao;
    private String dia;
    private String hora;
    
    public Eventos(){}
    
    public Eventos(String descricao, String dia, String hora)
    {
        this.descricao=descricao;
        this.dia=dia;
        this.hora = hora;
    }
    
    public void setHora(String hora)
    {
        this.hora = hora;
    }
    
    public String getHora()
    {
        return hora;
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