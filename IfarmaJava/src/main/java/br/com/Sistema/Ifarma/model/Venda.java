package br.com.Sistema.Ifarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue
    private Long id;

    private int numVenda;
    private String cliente;
    private String formaPaga;
    private LocalDate dataVenda;
    private String medicamentoVendido;
    private int qtdProd;
    private double vlrTotal;

}
