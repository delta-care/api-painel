package xyz.deltacare.painel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NovoBeneficiarioDto implements Serializable {
    String plano;
    String mes;
    Integer qtd;
}
