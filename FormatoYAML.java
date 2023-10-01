package org.example.code;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class FormatoYAML implements FormatoEstruturado {
    @Override
    public String formatar(Object objeto) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(dumperOptions);
        return yaml.dump(objeto);
    }
}
