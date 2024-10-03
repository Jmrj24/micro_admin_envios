package com.example.destinatarios.repository;

import com.example.destinatarios.dto.EnvioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "enviosapi", url = "http://localhost:9008")
public interface IDestinatarioAPIClient {
    @GetMapping("/envio/traerIdDestinatario/{idDestinatario}")
    public List<EnvioDTO> getAllEnviosByDestinatario(@PathVariable Long idDestinatario);
}
