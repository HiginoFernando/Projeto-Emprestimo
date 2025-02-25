package com.projetofiama.SESI.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofiama.SESI.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
