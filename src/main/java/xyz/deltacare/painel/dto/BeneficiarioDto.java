package xyz.deltacare.painel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BeneficiarioDto implements Serializable {
    String plano;
    String mes;
    String valor;
}
