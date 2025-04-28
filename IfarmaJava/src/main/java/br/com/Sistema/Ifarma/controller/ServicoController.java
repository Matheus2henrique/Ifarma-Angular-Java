package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Servico;
import br.com.Sistema.Ifarma.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CadServicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> listarServico(){
        return servicoService.listarServico();
    }

    @PostMapping
    public Servico salvarServico(@RequestBody Servico servico){
        return servicoService.salvarServico(servico);
    }
}
