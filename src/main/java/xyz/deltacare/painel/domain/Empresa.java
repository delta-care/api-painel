package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Empresa implements Serializable {
    private String plano;
    private String mes;
    private String valor;
}
