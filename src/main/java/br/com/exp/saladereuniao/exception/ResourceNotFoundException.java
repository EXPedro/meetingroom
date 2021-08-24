package br.com.exp.saladereuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    //constructor
    public ResourceNotFoundException(String message){
        super(message);
    }
}
