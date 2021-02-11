package xyz.deltacare.painel.service;

import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.PainelDto;

import java.util.List;

public interface PainelService {
    List<Painel> obterTodos();
    Painel obterPorCodigo(String codigo);
    PainelDto save(PainelDto painelDto);
}
