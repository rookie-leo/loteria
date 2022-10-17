package br.com.loterias.caixa.gateway.rest.clients.dataContract;

public class ConsultaResultadoRequest {

    private String nome;
    private String numeroConcurso;
    private String token;

    @Deprecated
    public ConsultaResultadoRequest() {
    }

    public ConsultaResultadoRequest(String nome, String numeroConcurso, String token) {
        this.nome = nome;
        this.numeroConcurso = numeroConcurso;
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConcurso() {
        return numeroConcurso;
    }

    public String getToken() {
        return token;
    }
}
