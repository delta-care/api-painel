package xyz.deltacare.painel.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Document
public class Painel implements Serializable {
    @Id
    private String id;
    private List<Receita> receitas;
    private List<Despesa> despesas;
    private List<Resultado> resultados;
    private List<Empresa> empresas;
    private List<Beneficiario> beneficiarios;
}
