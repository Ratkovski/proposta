package br.com.zupacademy.ratkovski.proposta.service;


import br.com.zupacademy.ratkovski.proposta.domain.Covid;
import br.com.zupacademy.ratkovski.proposta.dto.CovidDto;

import br.com.zupacademy.ratkovski.proposta.mapper.CovidMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CovidService {


    private final Covid19Client covid19Client;

    public void consultaEPublicaStatus(String country) {
        final CovidDto covidDto = covid19Client.getPais(country);
        System.out.println("CHEGUEI AQUI"+country);
        final Covid  covid = CovidMapper.INSTANCE.mapFrom(covidDto);



    }
}
