package com.example.mensajeria_ms.infrastructure.endpoints;


import com.example.mensajeria_ms.application.dto.SmsRequestDto;
import com.example.mensajeria_ms.domain.ports.in.SendSmsPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications/sms")
public class SmsController {

    private final SendSmsPort sendSmsPort;

    public SmsController(SendSmsPort sendSmsPort) {
        this.sendSmsPort = sendSmsPort;
    }

    @PostMapping
    public ResponseEntity<Void> sendSms(@RequestBody SmsRequestDto dto) {
        sendSmsPort.send(dto.getTo(), dto.getMessage());
        return ResponseEntity.ok().build();
    }
}
