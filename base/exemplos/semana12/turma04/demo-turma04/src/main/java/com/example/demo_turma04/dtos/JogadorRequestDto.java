package com.example.demo_turma04.dtos;

import jakarta.validation.constraints.*;

public record JogadorRequestDto(
        @NotBlank @Size(min = 5, max=10, message = "Precisa estar entre 5 e 10") String nome,
        @NotNull String apelido,
        @NotNull String posicao,
        @Min(value = 18) @Max(value = 100) Integer idade
) {}
