package com.projetofiama.SESI.repository;

import com.projetofiama.SESI.model.BlocoHorario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocoHorarioRepository extends JpaRepository<BlocoHorario, Long> {
}
