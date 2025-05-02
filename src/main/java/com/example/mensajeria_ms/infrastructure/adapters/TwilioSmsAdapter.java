package com.example.mensajeria_ms.infrastructure.adapters;

    import com.example.mensajeria_ms.infrastructure.configuration.TwilioConfiguration;

    import com.example.mensajeria_ms.domain.ports.out.SmsSenderPort;
    import com.twilio.rest.api.v2010.account.Message;
    import org.springframework.stereotype.Component;

    import com.twilio.type.PhoneNumber;

@Component
public class TwilioSmsAdapter implements SmsSenderPort {

    private final TwilioConfiguration twilioConfiguration;

    public TwilioSmsAdapter(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(String to, String message) {
        Message.creator(
                new PhoneNumber(to),
                new PhoneNumber(twilioConfiguration.getPhoneNumber()),
                message
        ).create();
    }
}
