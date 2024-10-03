package com.example.destinatarios.controller;

import com.example.destinatarios.dto.EnvioDTO;
import com.example.destinatarios.model.Destinatario;
import com.example.destinatarios.service.IDestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinatario")
public class DestinatarioController {
    @Autowired
    private IDestinatarioService destinatarioServi;

    @PostMapping("/crear")
    public String saveDestinatario(@RequestBody Destinatario destinatario) {
        destinatarioServi.saveDestinatario(destinatario);
        return "Destinatario creado correctamente";
    }

    @GetMapping("/traer")
    public List<Destinatario> getAllDestinatarios() {
        return destinatarioServi.getAllDestinatarios();
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteDestinatario(@PathVariable Long id) {
        destinatarioServi.deleteDestinatarioById(id);
        return "Destinatario eliminado correctamente";
    }

    @PutMapping("/editar")
    public Destinatario editDestinatario(@RequestBody Destinatario destinatario) {
        destinatarioServi.editDestinatario(destinatario);
        return destinatarioServi.getDestinatarioById(destinatario.getId());
    }

    @GetMapping("/traer/envio/{idDestinatario}")
    public List<EnvioDTO> getAllEnviosByDestinatario(@PathVariable Long idDestinatario) {
        return destinatarioServi.getAllEnviosByDestinatario(idDestinatario);
    }
}
