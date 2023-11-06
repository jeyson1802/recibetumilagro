package com.recibetumilagro.cruzada.service.impl;

import com.recibetumilagro.cruzada.dto.ConferenciaDto;
import com.recibetumilagro.cruzada.model.Conferencia;
import com.recibetumilagro.cruzada.repository.ConferenciaRepository;
import com.recibetumilagro.cruzada.service.ConferenciaService;
import com.recibetumilagro.cruzada.util.Constante;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenciaServiceImpl implements ConferenciaService {

    private static final Logger logger = LogManager.getLogger(ConferenciaServiceImpl.class);

    @Autowired
    private ConferenciaRepository conferenciaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ConferenciaDto obtenerConferenciaPorPais(Integer idPais) throws Exception {

        Conferencia conferencia = conferenciaRepository.findByPaisIdAndEstado(idPais, Constante.COD_ESTADO_ACTIVO);

        logger.info("conferencia ===> " + conferencia.toString());

        ConferenciaDto conferenciaDto = modelMapper.map(conferencia, ConferenciaDto.class);

        logger.info("conferenciaDto ===> " + conferenciaDto.toString());

        return conferenciaDto;
    }
}
