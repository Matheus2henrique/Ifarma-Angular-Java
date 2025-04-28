package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda , Long> {
}
