package xyz.deltacare.painel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DespesaDto implements Serializable {
    private String mes;
    private String valor;
}
