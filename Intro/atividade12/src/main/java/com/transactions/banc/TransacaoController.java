package com.transactions.banc;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banco")
public class TransacaoController {
    private final TransacoesService transacoesService;

    public TransacaoController() {
        this.transacoesService = new TransacoesService();
    }

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        Conta contaOrigem = transacoesService.buscarConta(request.getOrigem());
        Conta contaDestino = transacoesService.buscarConta(request.getDestino());

        TransacaoResponseDTO response = new TransacaoResponseDTO(
                ContaMapper.toDTO(contaOrigem),
                ContaMapper.toDTO(contaDestino),
                request.getValor()
        );

        return response;
    }
}