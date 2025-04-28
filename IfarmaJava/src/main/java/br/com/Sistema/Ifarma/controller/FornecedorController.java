package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Fornecedor;
import br.com.Sistema.Ifarma.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CadFornecedores")
public class FornecedorController {

    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public List<Fornecedor> listarFornecedor(){
        return fornecedorService.listarFornecedor();
    }

    @PostMapping
    public Fornecedor salvarFornecedor(@RequestBody Fornecedor fornecedor){
        return fornecedorService.salvarFornecedor(fornecedor);
    }
}
