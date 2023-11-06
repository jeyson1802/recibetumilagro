package com.recibetumilagro.cruzada.repository;

import com.recibetumilagro.cruzada.model.RegistroConferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroConferenciaRepository extends JpaRepository<RegistroConferencia, Integer> {

    RegistroConferencia findByCorreo(String correo) throws Exception;
}