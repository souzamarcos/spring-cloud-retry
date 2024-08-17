package com.marcos.retry.consumer;

import com.marcos.retry.consumer.dto.GenericMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component("genericMessageConsumer")
public class GenericMessageConsumer implements Consumer<Message<GenericMessage>> {

    @Override
    public void accept(Message<GenericMessage> genericMessageMessage) {
        log.info("Receiving message: [headers={}, payload={}]", genericMessageMessage.getHeaders(), genericMessageMessage.getPayload());
        throw new NullPointerException("Example exception");
    }
}
