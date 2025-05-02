package com.example.mensajeria_ms.domain.usecases;


import com.example.mensajeria_ms.domain.ports.in.SendSmsPort;
import com.example.mensajeria_ms.domain.ports.out.SmsSenderPort;
import org.springframework.stereotype.Component;

@Component
public class SendSmsUseCase implements SendSmsPort {

    private final SmsSenderPort smsSenderPort;

    public SendSmsUseCase(SmsSenderPort smsSenderPort) {
        this.smsSenderPort = smsSenderPort;
    }

    @Override
    public void send(String to, String message) {
        smsSenderPort.sendSms(to, message);
    }
}
