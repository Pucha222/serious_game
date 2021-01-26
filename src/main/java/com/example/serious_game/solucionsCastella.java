package com.example.serious_game;

public class solucionsCastella {


    private boolean preguntaRepe = false;
    private String pregunta;
    private String solucio;

    public solucionsCastella(String pregunta, String solucio) {
        this.pregunta = pregunta;
        this.solucio = solucio;
    }

    public String pregunta() {
        return pregunta;
    }

    public boolean isPreguntaRepe() {
        return preguntaRepe;
    }

    public void setPreguntaRepe(boolean preguntaRepe) {
        this.preguntaRepe = preguntaRepe;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getSolucio() {
        return solucio;
    }

    public void setSolucio(String solucio) {
        this.solucio = solucio;
    }
}
