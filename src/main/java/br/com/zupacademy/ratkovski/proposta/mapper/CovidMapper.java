package br.com.zupacademy.ratkovski.proposta.mapper;

import br.com.zupacademy.ratkovski.proposta.domain.Covid;
import br.com.zupacademy.ratkovski.proposta.dto.CovidDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CovidMapper {
    
    CovidMapper INSTANCE = Mappers.getMapper(CovidMapper.class);
    Covid mapFrom(final CovidDto covidDto);
}
