package me.dio.sacola.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private double valorUnitario;

    @Builder.Default
    private Boolean disponivel = true;

    @ManyToMany
    @JsonIgnore
    private Restaurante restaurante;
}
