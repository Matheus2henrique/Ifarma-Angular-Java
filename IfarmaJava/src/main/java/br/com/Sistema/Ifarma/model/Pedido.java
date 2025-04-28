package br.com.Sistema.Ifarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPedido;
    private String produto;
    private String status;
    private double vlrUnitario;
    private String fornecedor;
    private int qtdPedido;
    private LocalDate dataEntrega;
    private double vlrTotal;

}
