package com.api.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Integer id;
    private String descricao;
    private LocalDate dataParaFinalizar;
    private Boolean finalizacao = false;
}
