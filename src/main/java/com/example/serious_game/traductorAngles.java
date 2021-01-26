package com.example.serious_game;

public class traductorAngles {

    private boolean preguntaRepe = false;
    private String paraulaCatala;
    private String paraulaAngles;

    public traductorAngles(String paraulaCatala, String paraulaAngles) {
        this.paraulaCatala = paraulaCatala;
        this.paraulaAngles = paraulaAngles;
    }

    public String getParaulaCatala() {
        return paraulaCatala;
    }

    public boolean isPreguntaRepe() {
        return preguntaRepe;
    }

    public void setPreguntaRepe(boolean preguntaRepe) {
        this.preguntaRepe = preguntaRepe;
    }

    public void setParaulaCatala(String paraulaCatala) {
        this.paraulaCatala = paraulaCatala;
    }

    public String getParaulaAngles() {
        return paraulaAngles;
    }

    public void setParaulaAngles(String paraulaAngles) {
        this.paraulaAngles = paraulaAngles;
    }
}
