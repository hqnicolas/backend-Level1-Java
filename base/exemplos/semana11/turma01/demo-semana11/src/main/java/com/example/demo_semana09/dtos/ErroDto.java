package com.example.demo_semana09.dtos;

import org.springframework.http.HttpStatus;

public record ErroDto (
        HttpStatus status,
        String reason
) {
}
