package br.com.loterias.caixa.gateway.rest.clients.dataContract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalGanhadores {

    @JsonProperty("local")
    private String local;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("quantidade_ganhadores")
    private int quantidadeGanhadores;

    @JsonProperty("canal_eletronico")
    private boolean canalEletronico;

    @Deprecated
    public LocalGanhadores() {}

    public LocalGanhadores(String local, String cidade, String uf, int quantidadeGanhadores, boolean canalEletronico) {
        this.local = local;
        this.cidade = cidade;
        this.uf = uf;
        this.quantidadeGanhadores = quantidadeGanhadores;
        this.canalEletronico = canalEletronico;
    }

    public String getLocal() {
        return local;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public int getQuantidadeGanhadores() {
        return quantidadeGanhadores;
    }

    public boolean isCanalEletronico() {
        return canalEletronico;
    }
}
