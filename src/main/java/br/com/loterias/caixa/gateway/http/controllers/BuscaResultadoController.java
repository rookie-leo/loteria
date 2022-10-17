package br.com.loterias.caixa.gateway.http.controllers;

import br.com.loterias.caixa.gateway.rest.clients.dataContract.ConsultaResultadoRequest;
import br.com.loterias.caixa.service.LoteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resultados")
public class BuscaResultadoController {

    @Autowired
    private final LoteriaService loteriaService;

    public BuscaResultadoController(LoteriaService loteriaService) {
        this.loteriaService = loteriaService;
    }

    @PostMapping
    public ResponseEntity<?> searchResult(ConsultaResultadoRequest request) {
        if (request != null) {
            loteriaService.searchResult(request);
        }

        return ResponseEntity.badRequest().build();
    }

}
