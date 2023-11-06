package com.recibetumilagro.cruzada.service;

import com.recibetumilagro.cruzada.dto.ConferenciaDto;

public interface ConferenciaService {

    ConferenciaDto obtenerConferenciaPorPais(Integer idPais) throws Exception;

}
