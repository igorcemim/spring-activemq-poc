package br.com.cemim.queue.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleMessage implements Serializable {

    private static final long serialVersionUID = 5640582056097099865L;
    private String content;
}