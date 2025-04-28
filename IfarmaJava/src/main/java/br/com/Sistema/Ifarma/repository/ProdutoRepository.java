package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto , Long> {
}

