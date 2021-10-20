package com.company;

public class ClienteJuridico extends Cliente {
    private String cnpj;

    public ClienteJuridico(String nome, int numConta, String cnpj)
    {
        this.nome     = nome;
        this.numConta = numConta;
        this.cnpj      = cnpj;
    }

    @Override
    public String depositarValor(Double valor) {
        return null;
    }

    @Override
    public Double sacarValor(Double valor) {
        return null;
    }
}
