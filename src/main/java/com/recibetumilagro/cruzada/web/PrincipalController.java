package com.recibetumilagro.cruzada.web;

import com.recibetumilagro.cruzada.service.*;
import com.recibetumilagro.cruzada.util.Constante;
import com.recibetumilagro.cruzada.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PrincipalController {

    @Autowired
    private PaisService paisService;

    @Autowired
    private CargoService cargoService;

    @Autowired
    private FuenteService fuenteService;

    @Autowired
    private ConferenciaService conferenciaService;

    @Autowired
    private QRCodeService qrCodeService;

    @GetMapping("/")
    public String inicioPage(Model model) throws Exception {

        model.addAttribute("conferencia", conferenciaService.obtenerConferenciaPorPais(Constante.COD_PAIS_PERU));
        return "home";
    }

    @GetMapping("/registroconferencia")
    public String registroConferenciaPage(Model model) throws Exception {

        model.addAttribute("conferencia", conferenciaService.obtenerConferenciaPorPais(Constante.COD_PAIS_PERU));
        model.addAttribute("paises", paisService.listarPaises());
        model.addAttribute("cargos", cargoService.listarCargos());
        model.addAttribute("fuentes", fuenteService.listarFuentes());

        return "registroconferencia";
    }

    @GetMapping("/recibetumilagro")
    public String recibetumilagro(Model model) throws Exception {

        return "recibetumilagro";
    }

    @GetMapping("/preguntasfrecuentes")
    public String preguntasfrecuentes(Model model) throws Exception {

        return "preguntasfrecuentes";
    }
}
