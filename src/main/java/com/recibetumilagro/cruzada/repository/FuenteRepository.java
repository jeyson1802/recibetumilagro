package com.recibetumilagro.cruzada.repository;

import com.recibetumilagro.cruzada.model.Fuente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FuenteRepository extends CrudRepository<Fuente, Integer> {

    List<Fuente> findByEstadoOrderByIdAsc(String estado) throws Exception;
}