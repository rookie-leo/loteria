package br.com.loterias.caixa.gateway.rest.clients;

import br.com.loterias.caixa.gateway.rest.clients.dataContract.ConsultaResultadoDadosContratoResponse;
import br.com.loterias.caixa.gateway.rest.clients.dataContract.ConsultaResultadoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "loteria", url = "${api.loteria.resultado.url}", primary = false)
public interface LoteriaClient {

    @PostMapping
    ConsultaResultadoDadosContratoResponse getResultado(@RequestBody ConsultaResultadoRequest request);

}
