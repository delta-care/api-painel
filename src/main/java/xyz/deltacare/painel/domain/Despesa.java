package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Despesa {
    private String mes;
    private String valor;
}
