package br.com.loterias.caixa.http.model;

import java.util.Objects;

public class DadosConsulta {

    private String nomeLoteria;
    private Integer numeroConcurso;

    @Deprecated
    public DadosConsulta() {}

    public DadosConsulta(String nomeLoteria, Integer numeroConcurso) {
        this.nomeLoteria = nomeLoteria;
        this.numeroConcurso = numeroConcurso;
    }

    public String getNomeLoteria() {
        return nomeLoteria;
    }

    public Integer getNumeroConcurso() {
        return numeroConcurso;
    }

    @Override
    public String toString() {
        return "DadosConsulta{" +
                "nomeLoteria='" + nomeLoteria + '\'' +
                ", numeroConcurso=" + numeroConcurso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosConsulta that = (DadosConsulta) o;
        return Objects.equals(nomeLoteria, that.nomeLoteria) && Objects.equals(numeroConcurso, that.numeroConcurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeLoteria, numeroConcurso);
    }
}
