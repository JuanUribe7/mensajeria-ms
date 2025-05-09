package com.example.mensajeria_ms.infrastructure.configuration;

import com.example.mensajeria_ms.domain.ports.in.SendSmsPort;
import com.example.mensajeria_ms.domain.ports.out.SmsSenderPort;
import com.example.mensajeria_ms.domain.usecases.SendSmsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public SendSmsPort sendSmsPort(SmsSenderPort smsSenderPort) {
        return new SendSmsUseCase(smsSenderPort);
    }
}
