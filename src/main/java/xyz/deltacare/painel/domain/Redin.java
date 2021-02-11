package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Redin {
    String id;
    String nome;
    String qtd;
}
