package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita , Long> {
}
