package com.jogador.web;

import com.jogador.web.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}