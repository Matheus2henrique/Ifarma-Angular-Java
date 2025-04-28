package br.com.Sistema.Ifarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate validade;
    private LocalDate dataFabricacao;
    private int quantidade;
    private String receita;
    private String descricao;
    private int codigo;
    private double valor;
    private String lote;
    private String categoria;

}
