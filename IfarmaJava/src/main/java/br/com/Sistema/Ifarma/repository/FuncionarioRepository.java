package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
