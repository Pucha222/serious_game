package com.example.serious_game;

public class solucionsMates {

    private boolean preguntaRepe = false;
    private String problema;
    private String solucio;

    public solucionsMates(String problema, String solucio) {
        this.problema = problema;
        this.solucio = solucio;
    }

    public String problema() {
        return problema;
    }

    public boolean isPreguntaRepe() {
        return preguntaRepe;
    }

    public void setPreguntaRepe(boolean preguntaRepe) {
        this.preguntaRepe = preguntaRepe;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucio() {
        return solucio;
    }

    public void setSolucio(String solucio) {
        this.solucio = solucio;
    }
}
