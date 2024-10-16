package com.avenida.despesas.model;

import java.util.List;

public class Despesa {
    private int id;
    private String tipo;
    private String descricao;
    private List<Parcela> listaParcelas;
    private int quantidadeParcelas;
}
