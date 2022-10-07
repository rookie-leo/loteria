package br.com.loterias.caixa.service;

import br.com.loterias.caixa.http.model.DadosConsulta;
import br.com.loterias.caixa.http.rest.clients.LoteriaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoteriaService {

    @Autowired
    private final LoteriaClient client;

    public LoteriaService(LoteriaClient client) {
        this.client = client;
    }

    public void searchResult(DadosConsulta request) {
        
    }
}
