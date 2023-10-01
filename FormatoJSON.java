package org.example.code;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class FormatoJSON implements FormatoEstruturado {
    @Override
    public String formatar(Object objeto) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(objeto);
    }
}
