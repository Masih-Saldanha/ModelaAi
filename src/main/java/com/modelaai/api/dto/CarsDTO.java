package com.modelaai.api.dto;

public record CarsDTO(
        String modelo,
        String fabricante,
        String dataFabricacao,
        Double valor,
        Number anoModelo) {

}
