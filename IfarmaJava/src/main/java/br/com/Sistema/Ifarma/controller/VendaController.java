package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Venda;
import br.com.Sistema.Ifarma.service.VendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RegsVendas")
public class VendaController {

    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping
    public List <Venda> listarVenda(){
        return vendaService.listarVenda();
    }

    @PostMapping
    public Venda salvarVenda(@RequestBody Venda venda){
        return vendaService.salvarVenda(venda);
    }

}
