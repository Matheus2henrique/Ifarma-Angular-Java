package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Receita;
import br.com.Sistema.Ifarma.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    public List<Receita> listarReceita(){
        return receitaRepository.findAll();
    }

    public Receita salvarReceita(Receita receita){
        return receitaRepository.save(receita);
    }
}
