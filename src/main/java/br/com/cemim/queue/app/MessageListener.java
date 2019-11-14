package br.com.cemim.queue.app;

import br.com.cemim.queue.config.JmsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

@Component
public class MessageListener {

    private static Logger log = LoggerFactory.getLogger(MessageListener.class);

    @JmsListener(destination = JmsConfig.MESSAGE_QUEUE_NAME, containerFactory = "defaultContainerFactory")
    public void receiveMessage(@Payload ExampleMessage exampleMessage,
                               @Headers MessageHeaders headers,
                               Message message,
                               Session session) {
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("Received Message Details");
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("Headers: " + headers);
        log.info("Message: " + message);
        log.info("Session: " + session);
        log.info("Payload: " + exampleMessage);
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

}