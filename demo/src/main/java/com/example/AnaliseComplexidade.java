package com.example;

public class AnaliseComplexidade {

    private static final int N = 10;

    public static int getN(){
        return 10;
    }

    public void tempoConstante(int[] numeros) {
        System.out.println("Primero numero do vetor" + numeros[0]);
    }

    public void tempoLogaritmico(int n) {

        int passos = 0;

        int valor = n;

        while (valor > 1) {
            valor = valor / 2;
            passos ++;

            System.out.println("Passo" + passos + " -> valor reduzido para:" + valor);
        }
    }

    public void tempoLinear(int n) {

            for (int i = 0; i < n; i++){

                System.out.println("contando" + i);
            }
    }
    
    public void tempoQuadratico(int n) {
        for (int i = 0; i < n; i++) {
            for(int j= 0; j < n; j++) {
                System.out.println("contanto" + i);
            System.out.println("Par: (" + i + "" + j+")");
        }
    }

    }
         
}
