package br.com.Sistema.Ifarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int codReceita;
    private String nomePaciente;
    private String nomeMedico;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private int crm;
    private String prescricao;

}
