package br.com.dio.exercicios;

public class Interruptores {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            if(i == 12) break;
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
