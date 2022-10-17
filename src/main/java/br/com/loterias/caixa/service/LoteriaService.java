package br.com.loterias.caixa.service;

import br.com.loterias.caixa.gateway.rest.clients.dataContract.ConsultaResultadoRequest;
import br.com.loterias.caixa.gateway.rest.clients.LoteriaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoteriaService {

    @Autowired
    private final LoteriaClient client;

    @Value("token.loteria")
    private String TOKEN;


    public LoteriaService(LoteriaClient client) {
        this.client = client;
    }

    public void searchResult(ConsultaResultadoRequest request) {
        var resultado = client.getResultado(request);
    }

    public void friltaResultado() {

    }
}
