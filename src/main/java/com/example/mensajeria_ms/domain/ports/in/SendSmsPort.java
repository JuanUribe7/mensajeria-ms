package com.example.mensajeria_ms.domain.ports.in;

public interface SendSmsPort {
    void send(String to, String message);
}
