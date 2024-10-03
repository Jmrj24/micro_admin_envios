package com.example.envios.repository;

import com.example.envios.model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEnvioRepository extends JpaRepository<Envio, Long> {

    @Query("SELECT e FROM Envio e WHERE :idDestinatario=e.idDestinatario")
    List<Envio> getEnviosByIdDestinatario(Long idDestinatario);
}
