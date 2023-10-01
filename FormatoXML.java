package org.example.code;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class FormatoXML implements FormatoEstruturado {
    @Override
    public String formatar(Object objeto) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(objeto);
    }
}
