package com.projetofiama.SESI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofiama.SESI.model.Atividade;
import com.projetofiama.SESI.repository.AtividadeRepository;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public Atividade save(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public List<Atividade> findAll() {
        return atividadeRepository.findAll();
    }
}
