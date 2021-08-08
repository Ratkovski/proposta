package br.com.zupacademy.ratkovski.proposta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class PaisDto {

    @JsonProperty
    private String country;
}
