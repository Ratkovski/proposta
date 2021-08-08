package br.com.zupacademy.ratkovski.proposta.controller;


import br.com.zupacademy.ratkovski.proposta.dto.PaisDto;
import br.com.zupacademy.ratkovski.proposta.service.CovidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class ConsultaStatusCovidController {


    final CovidService covidService;

    @PostMapping
    public ResponseEntity<?> consultaCep(@RequestBody PaisDto paisDto) {
        try {
            covidService.consultaEPublicaStatus(paisDto.getCountry());
            System.out.println(paisDto.getCountry());

            return ResponseEntity.ok().build();

        }catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
            return ResponseEntity.badRequest().build();
        }

    }
}
