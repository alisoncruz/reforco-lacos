package br.com.dio.exercicios;

public class Loops {

    public static void main(String[] args) {

        System.out.println("10 a 20");
        for (int i = 10; i <= 20; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("20 a 10");
        for (int i = 20; i >= 10; i--) {
            System.out.println("Número: " + i);
        }

        boolean continuar = false;
        while (continuar) {
            System.out.println("Apenas uma execução");
            continuar = false;
        }

        int limiteTentativas = 3;
        int tentativa = 1;
        while (tentativa <= limiteTentativas) {
            System.out.println("Tentativa: " + tentativa);
            tentativa++;
        }

        int vezes = 1;
        do{
            System.out.println("Iteração: "+ vezes);
            vezes++;
        } while (vezes <=5);


        System.out.println("3 a 11");
        for (int i = 3; i <= 11; i += 2) {
            if (i == 7) continue;
            System.out.println(i);
        }


        System.out.println("Texto 5 vezes");
        int count = 0;
        boolean prosseguir = true;
        while (prosseguir) {
            System.out.println("Reforçando o conceito de laços em Java");
            count++;
            if (count >= 5) prosseguir = false;
        }


    }
}
