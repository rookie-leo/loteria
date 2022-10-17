package br.com.loterias.caixa.gateway.http.enums;

public enum NomeLoteria {

    MEGA_SENA("MEGA-SENA", 0);

    private String nomeLoteria;
    private int index;

    NomeLoteria(String nomeLoteria, int index) {
        this.nomeLoteria = nomeLoteria;
        this.index = index;
    }

    public String getNomeLoteria() {
        return nomeLoteria;
    }
}
