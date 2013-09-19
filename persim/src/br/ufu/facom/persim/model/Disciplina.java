package br.ufu.facom.persim.model;
import java.util.List;

public class Disciplina {
    
    /*
     * Eventos incluem aulas, horarios de atendimento...
     */
    
    private String ID;
    private String nome;
    private Professor professor;
    //private String adicionais;
    private List<String> bibliografia;
    private List<EventoAvaliativo> eventos;
    private List<Aula> aulas;
    private String sala; 
    
    public Disciplina () {}
    
    public Disciplina (String ID, String nome, Professor professor, String sala/*, String adicionais*/) {
        this.ID = ID;
        this.nome = nome;
        this.professor = professor;
        this.sala = sala; 
        //this.adicionais = adicionais;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(List<String> bibliografias) {
        this.bibliografia = bibliografias;
    }
    
    public List<Aula> getAulas()
    {
        return aulas;       
    }
    
    public void setAulas(List<Aula> aulas)
    {
        this.aulas = aulas;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void setEventos(List<EventoAvaliativo> eventos) {
        this.eventos = eventos;
    }
    
    public List<EventoAvaliativo> getEventos() {
        return eventos;
    }
    
     public String getSala() {
        return sala;
    }
    
    public void setSala(String sala) {
        this.sala = sala;
    }

   /* public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }*/
    
}
