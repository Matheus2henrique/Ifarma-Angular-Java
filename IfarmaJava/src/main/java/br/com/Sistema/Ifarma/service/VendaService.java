package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Venda;
import br.com.Sistema.Ifarma.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public List <Venda> listarVenda(){
        return vendaRepository.findAll();
    }

    public Venda salvarVenda(Venda venda){
        return vendaRepository.save(venda);
    }
}
