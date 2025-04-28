package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository <Pedido , Long> {
}
