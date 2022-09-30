package me.dio.sacola.resource;

import javax.persistence.Embeddable;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
