package br.com.zupacademy.ratkovski.proposta.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * {
 * "data": {
 * "country": "Brazil",
 * "cases": 1001,
 * "confirmed": 1021,
 * "deaths": 18,
 * "recovered": 2,
 * "updated_at": "2020-03-22T02:13:13.000Z"
 * }
 * }
 */
@Setter
@Getter
@ToString
public class Covid implements Serializable {
    private static final long serialVersionUID = 5248108177047444632L;

    private String country;
    private Integer cases;
    private Integer confirmed;
    private Integer deaths;
    private Integer recovered;
   // private LocalDateTime updated_at;
//[{"uid":35,"uf":"SP","state":"São Paulo","cases":4073622,"deaths":139464,"suspects":5334,"refuses":596,"datetime":"2021-08-03T21:35:19.082Z"}
}


