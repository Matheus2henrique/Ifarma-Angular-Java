package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Funcionario;
import br.com.Sistema.Ifarma.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CadFuncionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarFuncionario() {
        return funcionarioService.listarFuncionario();
    }

    @PostMapping
    public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioService.salvarFuncionario(funcionario);
    }
}
