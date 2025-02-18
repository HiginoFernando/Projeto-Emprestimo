package com.projetofiama.SESI;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.projetofiama.SESI.model.Atividade;
import com.projetofiama.SESI.model.Participante;
import com.projetofiama.SESI.repository.AtividadeRepository;
import com.projetofiama.SESI.repository.ParticipanteRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Override
    public void run(String... args) throws Exception {
      
        Atividade atividade1 = new Atividade();
        atividade1.setNome("Curso de HTML");
        atividade1.setDescricao("Aprenda HTML básico.");
        atividade1.setPreco(BigDecimal.valueOf(100));

        Atividade atividade2 = new Atividade();
        atividade2.setNome("Oficina de Java");
        atividade2.setDescricao("Introdução à programação em Java.");
        atividade2.setPreco(BigDecimal.valueOf(150));

        atividadeRepository.save(atividade1);
        atividadeRepository.save(atividade2);

        Participante participante1 = new Participante();
        participante1.setNome("João Silva");
        participante1.setEmail("joao@exemplo.com");

        Participante participante2 = new Participante();
        participante2.setNome("Maria Oliveira");
        participante2.setEmail("maria@exemplo.com");

        participanteRepository.save(participante1);
        participanteRepository.save(participante2);
    }
}
