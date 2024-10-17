package com.avenida.despesas.repository;

import com.avenida.despesas.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Integer> {
}
