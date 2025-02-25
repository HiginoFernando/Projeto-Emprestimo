package com.projetofiama.SESI.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofiama.SESI.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
