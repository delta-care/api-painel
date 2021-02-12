package xyz.deltacare.painel.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.NovoBeneficiarioDto;
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
    @Cacheable(value = "painel")
    public List<Painel> obterTodos() {
        return this.painelRepository.findAll();
    }

    @Override
    @CacheEvict(value = "painel")
    public PainelDto save(PainelDto painelDto) {
        Painel painel = mapper.toModel(painelDto);
        Painel painelSalvo = this.painelRepository.save(painel);
        return mapper.toDto(painelSalvo);
    }

    @Override
    public void save(NovoBeneficiarioDto novoBeneficiarioDto) {
        Painel painelExistente = this.painelRepository.findAll().get(0);
        painelExistente.getBeneficiarios()
                .stream()
                .filter(beneficiario -> beneficiario.getPlano().equals(novoBeneficiarioDto.getPlano()))
                .filter(beneficiario -> beneficiario.getMes().equals(novoBeneficiarioDto.getMes()))
                .findFirst()
                .ifPresent(beneficiario -> beneficiario.setValor(somarStr(beneficiario.getValor(),1)));
        this.painelRepository.save(painelExistente);
    }

    private String somarStr(String num1, Integer num2) {
        Integer resultado = Integer.parseInt(num1)+num2;
        return resultado.toString();
    }
}
