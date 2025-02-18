package com.projetofiama.SESI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofiama.SESI.model.Participante;
import com.projetofiama.SESI.repository.ParticipanteRepository;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public Participante save(Participante participante) {
        return participanteRepository.save(participante);
    }

    public List<Participante> findAll() {
        return participanteRepository.findAll();
    }
}
