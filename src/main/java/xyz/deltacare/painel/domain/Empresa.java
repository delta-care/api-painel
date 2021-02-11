package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Empresa {
    private String plano;
    private String mes;
    private String valor;
}
