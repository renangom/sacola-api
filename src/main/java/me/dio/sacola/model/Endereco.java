package me.dio.sacola.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
@Embeddable // esta minha classe não será uma entidade no banco
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}
