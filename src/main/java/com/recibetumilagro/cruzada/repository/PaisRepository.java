package com.recibetumilagro.cruzada.repository;

import com.recibetumilagro.cruzada.model.Pais;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaisRepository extends CrudRepository<Pais, Integer> {

    List<Pais> findByEstadoOrderByDescripcionAsc(String estado) throws Exception;

    Pais findByCode(String code) throws Exception;
}