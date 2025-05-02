package com.example.mensajeria_ms.domain.ports.out;

public interface SmsSenderPort {
    void sendSms(String to, String message);
}
