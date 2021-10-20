package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente[] cliente = new Cliente[2];

        cliente[0] = new ClienteFisico("Evandro", 1234, "010.020.200.42");
        cliente[1] = new ClienteJuridico("Daiane", 1234, "023.774.180.08");

        for (Cliente cli: cliente) {
            System.out.println( cli.getNome());
        }


    }
}
