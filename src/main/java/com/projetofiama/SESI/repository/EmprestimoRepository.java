package com.projetofiama.SESI.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofiama.SESI.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
