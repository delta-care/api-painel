package xyz.deltacare.painel.service;

import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.PainelDto;
import xyz.deltacare.painel.mapper.PainelMapper;
import xyz.deltacare.painel.repository.PainelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PainelServiceSpa implements PainelService {

    private final PainelRepository painelRepository;
    private static final PainelMapper mapper = PainelMapper.INSTANCE;

    public PainelServiceSpa(PainelRepository painelRepository) {
        this.painelRepository = painelRepository;
    }

    @Override
    //@Cacheable(value = "red")
    public List<Painel> obterTodos() {
        return this.painelRepository.findAll();
    }

    //@Cacheable(value = "red", key = "#codigo")
    public Painel obterPorCodigo(String codigo) {
        return this.painelRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Red não existe."));
    }

    @Override
    //@CachePut(value="red", key="#red.codigo")
    public PainelDto save(PainelDto painelDto) {
        Painel painel = mapper.toModel(painelDto);
        Painel painelSalvo = this.painelRepository.save(painel);
        return mapper.toDto(painelSalvo);
    }
}
