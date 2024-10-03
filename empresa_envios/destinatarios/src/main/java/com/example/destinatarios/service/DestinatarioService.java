package com.example.destinatarios.service;

import com.example.destinatarios.dto.EnvioDTO;
import com.example.destinatarios.model.Destinatario;
import com.example.destinatarios.repository.IDestinatarioAPIClient;
import com.example.destinatarios.repository.IDestinatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinatarioService implements IDestinatarioService{
    @Autowired
    private IDestinatarioRepository destinatarioRepo;

    @Autowired
    private IDestinatarioAPIClient destinatarioAPIClient;

    @Override
    public void saveDestinatario(Destinatario destinatario) {
        destinatarioRepo.save(destinatario);
    }

    @Override
    public List<Destinatario> getAllDestinatarios() {
        return destinatarioRepo.findAll();
    }

    @Override
    public Destinatario getDestinatarioById(Long id) {
        return destinatarioRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteDestinatarioById(Long id) {
        destinatarioRepo.deleteById(id);
    }

    @Override
    public void editDestinatario(Destinatario destinatario) {
        this.saveDestinatario(destinatario);
    }

    @Override
    public List<EnvioDTO> getAllEnviosByDestinatario(Long idDestinatario) {
        return destinatarioAPIClient.getAllEnviosByDestinatario(idDestinatario);
    }
}
