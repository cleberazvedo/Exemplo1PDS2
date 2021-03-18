package com.azevedo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.azevedo.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @WebMethod
    public String mostrarNome(String nome) {
        return nome;
    }
}