package com.algaworks.algafood.domain.exception;

public class NegocioException extends RuntimeException {
    private static final Long serialVersionUID = 1L;
    public NegocioException(String message){
       super(message);
    }

    public NegocioException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
