package com.example.envios.service;

import com.example.envios.model.Envio;
import com.example.envios.repository.IEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioService implements IEnvioService {
    @Autowired
    private IEnvioRepository envioRepo;

    @Override
    public void saveEnvio(Envio envio) {
        envioRepo.save(envio);
    }

    @Override
    public List<Envio> getAllEnvios() {
        return envioRepo.findAll();
    }

    @Override
    public Envio getEnvioById(Long id) {
        return envioRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteEnvioById(Long id) {
        envioRepo.deleteById(id);
    }

    @Override
    public void editEnvio(Envio envio) {
        this.saveEnvio(envio);
    }

    @Override
    public List<Envio> getEnviosByIdDestinatario(Long idDestinatario) {
        return envioRepo.getEnviosByIdDestinatario(idDestinatario);
    }
}
