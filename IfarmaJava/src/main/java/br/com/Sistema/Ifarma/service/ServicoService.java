package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Servico;
import br.com.Sistema.Ifarma.repository.ServicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> listarServico(){
        return servicoRepository.findAll();
    }

    @Transactional
    public Servico salvarServico(Servico servico){
        return servicoRepository.save(servico);
    }
}
