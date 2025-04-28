package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Fornecedor;
import br.com.Sistema.Ifarma.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<Fornecedor> listarFornecedor(){
        return fornecedorRepository.findAll();
    }

    public Fornecedor salvarFornecedor(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

}
