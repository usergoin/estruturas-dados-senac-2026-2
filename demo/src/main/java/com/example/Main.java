package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner feel = new Scanner(System.in);

     double valores[] = new double[5];

     for (int i = 0; i < 5; i++){

        System.out.println("Digite um valor " + (i + 1) + " ");
        valores[i] = feel.nextDouble();
        }

        double soma = 0;
        double maiorvalor = valores[0];
        double menorValor = valores[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        
        for(int i = 0; i < valores.length; i++) {
            soma += valores[i];

            if (valores[i] > maiorvalor){
                maiorvalor = valores[i];
                indiceMaior = i;
            }

            if(valores[i] < menorValor) {
                menorValor = valores[i];
                indiceMenor = i;
            }
        }

        double media = soma / valores.length;

        System.out.printf("Total do dia: %.2f%n", soma);
        System.out.printf("Media por caixa: %.2f%n", media);
        System.out.printf("Maior venda: Caixa %d com %.2f%n", (indiceMaior + 1), maiorvalor);
        System.out.printf("Menor venda: Caixa %d com %.2f%n", (indiceMenor + 1), menorValor);
  
     }

    }
