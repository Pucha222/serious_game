package com.example.serious_game;

public class solucionsNaturals {

        private boolean preguntaRepe = false;
        private String pregunta;
        private String solucio;

        public solucionsNaturals(String problema, String solucio) {
            this.pregunta = problema;
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

