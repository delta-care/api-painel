package xyz.deltacare.painel.service;

import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.NovoBeneficiarioDto;
import xyz.deltacare.painel.dto.PainelDto;

import java.util.List;

public interface PainelService {
    List<Painel> obterTodos();
    PainelDto save(PainelDto painelDto);
    void save(NovoBeneficiarioDto novoBeneficiarioDto);
}
