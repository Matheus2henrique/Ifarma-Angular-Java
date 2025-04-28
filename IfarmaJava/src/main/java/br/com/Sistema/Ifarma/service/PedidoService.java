package br.com.Sistema.Ifarma.service;

import br.com.Sistema.Ifarma.model.Pedido;
import br.com.Sistema.Ifarma.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();
    }

    public Pedido salvarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
