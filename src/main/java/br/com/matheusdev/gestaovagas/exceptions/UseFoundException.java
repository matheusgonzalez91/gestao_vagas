package br.com.matheusdev.gestaovagas.exceptions;

public class UseFoundException extends RuntimeException{
    public UseFoundException(){
        super("User already exists!");
    }
}
