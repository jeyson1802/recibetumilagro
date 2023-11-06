package com.recibetumilagro.cruzada.service.impl;

import com.recibetumilagro.cruzada.dto.PaisDto;
import com.recibetumilagro.cruzada.model.Pais;
import com.recibetumilagro.cruzada.repository.PaisRepository;
import com.recibetumilagro.cruzada.service.PaisService;
import com.recibetumilagro.cruzada.util.Constante;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaisServiceImpl implements PaisService {

    private static final Logger logger = LogManager.getLogger(PaisServiceImpl.class);

    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PaisDto> listarPaises() throws Exception {

        List<Pais> listPais = paisRepository.findByEstadoOrderByDescripcionAsc(Constante.COD_ESTADO_ACTIVO);

        List<PaisDto> listPaisDto = listPais.stream().map(pais -> modelMapper.map(pais, PaisDto.class)).collect(Collectors.toList());

        return listPaisDto;

    }
}
