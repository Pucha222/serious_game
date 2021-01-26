package com.example.serious_game;

public class jugador {

    private String nom;
    private Integer puntuacio;
    private Boolean jugadoractiu;



    public jugador(String sNom, int sPuntuacio, boolean jugadoractiu) {

        nom = sNom;
        puntuacio = sPuntuacio;
        this.jugadoractiu = jugadoractiu;

    }

    public Boolean getJugadoractiu() {
        return jugadoractiu;
    }

    public void setJugadoractiu(Boolean jugadoractiu) {
        this.jugadoractiu = jugadoractiu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(Integer puntuacio) {
        this.puntuacio = puntuacio;
    }
}
