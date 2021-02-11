package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Beneficiario {
    String plano;
    String mes;
    String valor;
}
