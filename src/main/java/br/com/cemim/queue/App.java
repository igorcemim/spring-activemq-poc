package br.com.cemim.queue;

import br.com.cemim.queue.app.ExampleMessage;
import br.com.cemim.queue.app.MessageSender;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements ApplicationRunner {

    private final MessageSender sender;

    public App(MessageSender sender) {
        this.sender = sender;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sender.send(new ExampleMessage("Hello world!!!"));
    }

}