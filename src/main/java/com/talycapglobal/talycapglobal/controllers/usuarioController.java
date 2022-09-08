package com.talycapglobal.talycapglobal.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.talycapglobal.talycapglobal.dto.usuarioReqDTO;
import com.talycapglobal.talycapglobal.models.usuario;
import com.talycapglobal.talycapglobal.services.usuarioService;

@RestController
@RequestMapping("api/v0")
@CrossOrigin(origins = "*")
public class usuarioController {

    Logger logger=Logger.getLogger(usuarioService.class.getName());

    @Autowired
    private usuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET, path = "/usuarios")
    public ResponseEntity<?> findall(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @RequestMapping(method = RequestMethod.GET,path="/usuario")
    public ResponseEntity<?> findByIdentificacion(@RequestBody usuarioReqDTO reqDTO){
        usuario user=usuarioService.findByIdentificacion(reqDTO.getIdentificacion(), reqDTO.getTipo());
        if(user==null)
        {
            return new ResponseEntity<>("Usuario no encontrado",HttpStatus.BAD_REQUEST);
        }
        else{
            logger.info("Usuario encontrado: "+reqDTO.getIdentificacion());
            return ResponseEntity.ok(user);
        }
    }
}
