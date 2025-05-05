package com.exercicio39;
import javax.swing.*;

public class Exercicio39 {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n = 0;

        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        } catch (NumberFormatException e) {
            System.out.println("Erro na entrada de dados");
            return; // encerra o programa se a entrada for inválida
        }

        try {
            n = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Tentando fazer uma divisao por 0: " + e);
            return; // encerra o programa se houver divisão por zero
        }

        System.out.println("O resultado é: " + n);
    }
}