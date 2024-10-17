package com.avenida.despesas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String tipo;

    private int numero;

    @OneToMany
    private List<Parcela> listaParcelas;

    private int quantidadeParcelas;

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String descricao) {
        this.nome = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Parcela> getListaParcelas() {
        return listaParcelas;
    }

    public void setListaParcelas(List<Parcela> listaParcelas) {
        this.listaParcelas = listaParcelas;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public void addParcelas(List<Parcela> listaParcelas) {
        this.listaParcelas.addAll(listaParcelas);
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "id=" + id +
                ", descricao='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", listaParcelas=" + listaParcelas +
                ", quantidadeParcelas=" + quantidadeParcelas +
                '}';
    }
}
