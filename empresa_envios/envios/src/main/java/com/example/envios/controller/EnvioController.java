package com.example.envios.controller;

import com.example.envios.model.Envio;
import com.example.envios.service.IEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envio")
public class EnvioController {
    @Autowired
    private IEnvioService envioServi;

    @PostMapping("/crear")
    public String saveEnvio(@RequestBody Envio envio) {
        envioServi.saveEnvio(envio);
        return "Envio creado correctamente";
    }

    @GetMapping("/traer")
    public List<Envio> getAllEnvios() {
        return envioServi.getAllEnvios();
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteEnvio(@PathVariable Long id) {
        envioServi.deleteEnvioById(id);
        return "Envio eliminado correctamente";
    }

    @PutMapping("/editar")
    public Envio editEnvio(@RequestBody Envio envio) {
        envioServi.editEnvio(envio);
        return envioServi.getEnvioById(envio.getId());
    }

    @GetMapping("/traerIdDestinatario/{idDestinatario}")
    public List<Envio> getEnviosByIdDestinatario(@PathVariable Long idDestinatario) {
        return envioServi.getEnviosByIdDestinatario(idDestinatario);
    }
}
