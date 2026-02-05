package org.example.accountservice.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.accountservice.service.AccountService;
import org.example.accountservice.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccountKafkaConsumer {

    @Autowired
    private AccountService accountService;

    @KafkaListener(topics = "card-events", groupId = "account-group")
    public void consumeCardCreatedEvent(String message)
    {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode event = objectMapper.readTree(message);

            if("CARD_CREATED".equals(event.get("event").asText())) {
                Long accountId = Long.valueOf(event.get("accountId").asText());
                log.info("CARD_CREATED : idAcccount : {}", accountId);
                AccountService accountService = new AccountServiceImpl();
                accountService.
            }

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
