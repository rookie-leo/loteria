package br.com.loterias.caixa.gateway.rest.clients.dataContract;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public class ConsultaResultadoDadosContratoResponse {

    @JsonProperty("nome")
    private String nomeLoteria;

    @JsonProperty("numero_concurso")
    private String numeroConcurso;

    @JsonProperty("data_concurso")
    private String dataConcurso;

    @JsonProperty("data_concurso_milliseconds")
    private String dataConcursoMilisconds;

    @JsonProperty("local_realizacao")
    private String localRealizacao;

    @JsonProperty("rateio_processamento")
    private boolean rateioProcessamento;

    @JsonProperty("acumulou")
    private boolean acumulou;

    @JsonProperty("valor_acumulado")
    private int valorAcumulado;

    @JsonProperty("dezenas")
    private Set<String> dezenas;

    @JsonProperty("premiacao")
    private Set<Premiacao> premiacaos;

    @JsonProperty("local_ganhadores")
    private List<LocalGanhadores> localGanhadores;

    @JsonProperty("arrecadacao_total")
    private int arrecadacaoTotal;

    @JsonProperty("data_proximo_concurso")
    private String dataProximoConcurso;

    @JsonProperty("data_proximo_concurso_milliseconds")
    private String dataProximoConcursoMileSeconds;

    @JsonProperty("valor_estimado_proximo_concurso")
    private int valorEstimadoProximoConcurso;

    @JsonProperty("valor_final_concurso_acumulado")
    private Double valorFinalConcursoAcumulado;

    @JsonProperty("numero_final_concurso_acumulado")
    private int numeroFinalConcursoAcumulado;

    @JsonProperty("valor_acumulado_especial")
    private Double valorAcumuladoEspecial;

    @JsonProperty("nome_acumulado_especial")
    private String nomeAcumuladoEspecial;

    @Deprecated
    public ConsultaResultadoDadosContratoResponse() {
    }

    public ConsultaResultadoDadosContratoResponse(String nomeLoteria, String numeroConcurso, String dataConcurso, String dataConcursoMilisconds, String localRealizacao, boolean rateioProcessamento, boolean acumulou, int valorAcumulado, int arrecadacaoTotal, String dataProximoConcurso, String dataProximoConcursoMileSeconds, int valorEstimadoProximoConcurso, Double valorFinalConcursoAcumulado, int numeroFinalConcursoAcumulado, Double valorAcumuladoEspecial, String nomeAcumuladoEspecial) {
        this.nomeLoteria = nomeLoteria;
        this.numeroConcurso = numeroConcurso;
        this.dataConcurso = dataConcurso;
        this.dataConcursoMilisconds = dataConcursoMilisconds;
        this.localRealizacao = localRealizacao;
        this.rateioProcessamento = rateioProcessamento;
        this.acumulou = acumulou;
        this.valorAcumulado = valorAcumulado;
        this.arrecadacaoTotal = arrecadacaoTotal;
        this.dataProximoConcurso = dataProximoConcurso;
        this.dataProximoConcursoMileSeconds = dataProximoConcursoMileSeconds;
        this.valorEstimadoProximoConcurso = valorEstimadoProximoConcurso;
        this.valorFinalConcursoAcumulado = valorFinalConcursoAcumulado;
        this.numeroFinalConcursoAcumulado = numeroFinalConcursoAcumulado;
        this.valorAcumuladoEspecial = valorAcumuladoEspecial;
        this.nomeAcumuladoEspecial = nomeAcumuladoEspecial;
    }

    public String getNomeLoteria() {
        return nomeLoteria;
    }

    public String getNumeroConcurso() {
        return numeroConcurso;
    }

    public String getDataConcurso() {
        return dataConcurso;
    }

    public String getDataConcursoMilisconds() {
        return dataConcursoMilisconds;
    }

    public String getLocalRealizacao() {
        return localRealizacao;
    }

    public boolean isRateioProcessamento() {
        return rateioProcessamento;
    }

    public boolean isAcumulou() {
        return acumulou;
    }

    public int getValorAcumulado() {
        return valorAcumulado;
    }

    public Set<String> getDezenas() {
        return dezenas;
    }

    public Set<Premiacao> getPremiacaos() {
        return premiacaos;
    }

    public List<LocalGanhadores> getLocalGanhadores() {
        return localGanhadores;
    }

    public int getArrecadacaoTotal() {
        return arrecadacaoTotal;
    }

    public String getDataProximoConcurso() {
        return dataProximoConcurso;
    }

    public String getDataProximoConcursoMileSeconds() {
        return dataProximoConcursoMileSeconds;
    }

    public int getValorEstimadoProximoConcurso() {
        return valorEstimadoProximoConcurso;
    }

    public Double getValorFinalConcursoAcumulado() {
        return valorFinalConcursoAcumulado;
    }

    public int getNumeroFinalConcursoAcumulado() {
        return numeroFinalConcursoAcumulado;
    }

    public Double getValorAcumuladoEspecial() {
        return valorAcumuladoEspecial;
    }

    public String getNomeAcumuladoEspecial() {
        return nomeAcumuladoEspecial;
    }
}
