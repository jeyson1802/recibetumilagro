package com.recibetumilagro.cruzada.service;

import com.recibetumilagro.cruzada.dto.RegistroConferenciaDto;
import com.recibetumilagro.cruzada.request.RequestRegistroConferencia;

import java.io.OutputStream;

public interface RegistroConferenciaService {

    RegistroConferenciaDto registrarParticipanteConferencia(RequestRegistroConferencia requestRegistroConferencia) throws Exception;

    void generarConstanciaParticipante(Integer idParticipante, OutputStream outputStream) throws Exception;

    void enviarEmailConstanciaParticipante(Integer idParticipante) throws Exception;

    void agregarContactoParticipanteSendinBlue(Integer idParticipante) throws Exception;

}
