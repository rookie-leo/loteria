package br.com.loterias.caixa.http.rest.clients;

import br.com.loterias.caixa.http.model.ConsultaResultadoDadosContrato;
import br.com.loterias.caixa.http.model.ConsultaResultadoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "loteria", url = "${api.loteria.resultado.url}", primary = false)
public interface LoteriaClient {

    @PostMapping
    ConsultaResultadoDadosContrato getResultado(@RequestBody ConsultaResultadoRequest request);

}
