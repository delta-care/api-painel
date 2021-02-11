package xyz.deltacare.painel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.PainelDto;

@Mapper
public interface PainelMapper {
    PainelMapper INSTANCE = Mappers.getMapper(PainelMapper.class);
    Painel toModel(PainelDto painelDto);
    PainelDto toDto(Painel painel);
}
