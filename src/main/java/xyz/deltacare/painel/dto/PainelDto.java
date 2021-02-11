package xyz.deltacare.painel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PainelDto {

    private String id;

    @JsonProperty("receitas")
    private List<ReceitaDto> receitas;

    @JsonProperty("despesas")
    private List<DespesaDto> despesas;

    @JsonProperty("resultados")
    private List<ResultadoDto> resultados;

    @JsonProperty("empresas")
    private List<EmpresaDto> empresas;

    @JsonProperty("beneficiarios")
    private List<BeneficiarioDto> beneficiarios;

}
