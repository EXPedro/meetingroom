package br.com.exp.saladereuniao.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

    //all args constructor
    public ErrorDetails(Date timestamp, String message, String details){
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
