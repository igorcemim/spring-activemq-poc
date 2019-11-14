package br.com.cemim.queue.app;

import br.com.cemim.queue.config.JmsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private static Logger log = LoggerFactory.getLogger(MessageSender.class);

    private final JmsTemplate jmsTemplate;

    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(ExampleMessage exampleMessage) {
        log.info("Sending message... <" + exampleMessage + ">");
        jmsTemplate.convertAndSend(JmsConfig.MESSAGE_QUEUE_NAME, exampleMessage);
    }
}