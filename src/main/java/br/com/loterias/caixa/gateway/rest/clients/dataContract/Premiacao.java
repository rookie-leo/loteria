package br.com.loterias.caixa.gateway.rest.clients.dataContract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Premiacao {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("quantidade_ganhadores")
    private int quantidadeGanhadores;

    @JsonProperty("valor_total")
    private Double valorTotal;

    @JsonProperty("acertos")
    private int acertos;

    @Deprecated
    public Premiacao() {}

    public Premiacao(String nome, int quantidadeGanhadores, Double valorTotal, int acertos) {
        this.nome = nome;
        this.quantidadeGanhadores = quantidadeGanhadores;
        this.valorTotal = valorTotal;
        this.acertos = acertos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeGanhadores() {
        return quantidadeGanhadores;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public int getAcertos() {
        return acertos;
    }
}
