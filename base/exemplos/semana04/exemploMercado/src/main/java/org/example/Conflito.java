package org.example;

import java.time.Instant;

public class Conflito extends Exception {
    public Conflito(String message) {
        super("[" + Instant.now() + "] " + message);
    }
}
