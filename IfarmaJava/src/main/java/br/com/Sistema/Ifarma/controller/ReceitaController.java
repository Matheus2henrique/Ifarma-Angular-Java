package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Receita;
import br.com.Sistema.Ifarma.service.ReceitaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContReceitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    @GetMapping
    public List<Receita> listarReceita(){
        return receitaService.listarReceita();
    }

    @PostMapping
    public Receita salvaReceita(@RequestBody Receita receita){
        return receitaService.salvarReceita(receita);
    }
}
