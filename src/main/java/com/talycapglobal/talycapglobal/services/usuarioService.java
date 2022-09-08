package com.talycapglobal.talycapglobal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talycapglobal.talycapglobal.models.usuario;
import com.talycapglobal.talycapglobal.repositories.usuarioRepository;
import java.util.logging.Logger;

@Service
public class usuarioService {
    Logger logger=Logger.getLogger(usuarioService.class.getName());

    @Autowired
    usuarioRepository usuarioRepository;

    public List<usuario>findAll(){
        return usuarioRepository.findAll();
    }

    public usuario findByIdentificacion(Long identificacion, String tipo){
        logger.info("Entro al servicio");
        return usuarioRepository.findByCedula(identificacion, tipo);
    }
    
}
