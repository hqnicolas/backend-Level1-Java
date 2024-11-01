package com.example.demo_turma04.repositories;

import com.example.demo_turma04.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {
}
