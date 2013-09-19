package br.ufu.facom.persim.model;


public class ControleDisciplina {
    
    private String disc_id;
    private float notas;
    private int faltas;
    private String trf_adicionais;
    
    
    public ControleDisciplina() {
    }
    
    public ControleDisciplina(String disc_id, float notas, int faltas, String trf_adicionais) {
        this.disc_id = disc_id;
        this.notas = notas;
        this.faltas = faltas;
        this.trf_adicionais = trf_adicionais;
    }

    public String getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(String disc_id) {
        this.disc_id = disc_id;
    }

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getTrf_adicionais() {
        return trf_adicionais;
    }

    public void setTrf_adicionais(String trf_adicionais) {
        this.trf_adicionais = trf_adicionais;
    }


}
