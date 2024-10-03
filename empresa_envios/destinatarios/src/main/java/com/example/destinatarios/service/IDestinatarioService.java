package com.example.destinatarios.service;

import com.example.destinatarios.dto.EnvioDTO;
import com.example.destinatarios.model.Destinatario;

import java.util.List;

public interface IDestinatarioService {
    public void saveDestinatario(Destinatario destinatario);

    public List<Destinatario> getAllDestinatarios();

    public Destinatario getDestinatarioById(Long id);

    public void deleteDestinatarioById(Long id);

    public void editDestinatario(Destinatario destinatario);

    public List<EnvioDTO> getAllEnviosByDestinatario(Long idDestinatario);
}
