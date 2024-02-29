package br.com.matheusdev.gestaovagas.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException(){
        super("User already exists!");
    }
}
