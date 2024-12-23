package com.teste.pratico.service;

import com.teste.pratico.model.Solicitante;
import com.teste.pratico.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitanteService {
    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public Solicitante cadastrarSolicitante(Solicitante solicitante) {
        return solicitanteRepository.save(solicitante);
    }
}
