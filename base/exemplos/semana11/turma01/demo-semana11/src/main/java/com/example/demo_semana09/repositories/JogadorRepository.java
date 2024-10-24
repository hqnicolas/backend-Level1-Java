package com.example.demo_semana09.repositories;

import com.example.demo_semana09.models.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<JogadorModel, UUID> {
}
