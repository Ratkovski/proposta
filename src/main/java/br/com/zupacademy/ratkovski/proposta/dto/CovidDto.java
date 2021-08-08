package br.com.zupacademy.ratkovski.proposta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CovidDto {

    @JsonProperty
    private String country;
    @JsonProperty
    private Integer cases;
    @JsonProperty
    private Integer confirmed;
    @JsonProperty
    private Integer deaths;
    @JsonProperty
    private Integer recovered;
    //@JsonProperty
    //private LocalDateTime updated_at;
}
