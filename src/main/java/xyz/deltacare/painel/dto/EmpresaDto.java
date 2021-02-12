package xyz.deltacare.painel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmpresaDto implements Serializable {
    private String plano;
    private String mes;
    private String valor;
}
