package br.com.Sistema.Ifarma.repository;

import br.com.Sistema.Ifarma.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRopository extends JpaRepository <Cliente , Long> {
}
