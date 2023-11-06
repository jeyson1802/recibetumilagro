package com.recibetumilagro.cruzada.repository;

import com.recibetumilagro.cruzada.model.Cargo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CargoRepository extends CrudRepository<Cargo, Integer> {

    List<Cargo> findByEstadoOrderByIdAsc(String estado) throws Exception;
}