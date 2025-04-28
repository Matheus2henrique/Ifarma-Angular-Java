package br.com.Sistema.Ifarma.controller;

import br.com.Sistema.Ifarma.model.Pedido;
import br.com.Sistema.Ifarma.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContPedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> listarPedido(){
        return pedidoService.listarPedido();
    }

    @PostMapping
    public Pedido salvarPedido(@RequestBody Pedido pedido){
        return pedidoService.salvarPedido(pedido);
    }
}
