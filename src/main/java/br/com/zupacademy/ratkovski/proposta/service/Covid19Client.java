package br.com.zupacademy.ratkovski.proposta.service;


import br.com.zupacademy.ratkovski.proposta.dto.CovidDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//https://covid19-brazil-api.vercel.app/api/report/v1
@FeignClient(value = "covid" , url = "https://covid19-brazil-api.now.sh/api/report/v1")
public interface Covid19Client {


    @RequestMapping(method = RequestMethod.GET, value = "/{country}", produces = "application/json")
    CovidDto getPais(@PathVariable("country") final String country);


}
