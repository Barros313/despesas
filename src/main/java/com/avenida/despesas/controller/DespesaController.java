package com.avenida.despesas.controller;

import com.avenida.despesas.model.Parcela;
import com.avenida.despesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(path = "/despesas")
public class DespesaController {
    @Autowired
    private DespesaRepository despesaRepository;

    public Parcela addParcela(Date vencimento, int numeroParcela, double valor) {
        Parcela parcela = new Parcela();

        parcela.setVencimento(vencimento);
        parcela.setValor(valor);
        parcela.setParcela(numeroParcela);

        return parcela;
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addDespesa(@RequestParam )
}
