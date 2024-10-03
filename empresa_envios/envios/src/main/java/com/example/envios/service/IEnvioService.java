package com.example.envios.service;

import com.example.envios.model.Envio;

import java.util.List;

public interface IEnvioService {
    public void saveEnvio(Envio envio);

    public List<Envio> getAllEnvios();

    public Envio getEnvioById(Long id);

    public void deleteEnvioById(Long id);

    public void editEnvio(Envio envio);

    public List<Envio> getEnviosByIdDestinatario(Long idDestinatario);
}
