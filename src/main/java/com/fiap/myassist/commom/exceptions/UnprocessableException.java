package com.fiap.myassist.commom.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UnprocessableException extends RuntimeException {
    private String mensagem;
}
