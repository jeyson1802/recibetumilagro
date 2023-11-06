package com.recibetumilagro.cruzada.repository;

import com.recibetumilagro.cruzada.model.Conferencia;
import org.springframework.data.repository.CrudRepository;

public interface ConferenciaRepository extends CrudRepository<Conferencia, Integer> {

    Conferencia findByPaisIdAndEstado(Integer idPais, String estado) throws Exception;
}