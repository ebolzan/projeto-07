package com.company;

public class ClienteFisico extends  Cliente{

    private String cpf;

    public ClienteFisico(String nome, int numConta, String cpf)
    {
        this.nome     = nome;
        this.numConta = numConta;
        this.cpf      = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
