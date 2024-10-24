package com.example.rest_turma03.repositories;

import com.example.rest_turma03.models.JogadorEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorEntidade, UUID> {
}
