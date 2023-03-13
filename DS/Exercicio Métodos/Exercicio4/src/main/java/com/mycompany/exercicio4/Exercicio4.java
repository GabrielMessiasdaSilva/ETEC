/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel 22
 */
public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Resto da divisão");
        System.out.println("6 - Dobro");
        System.out.println("7 - Quadrado");
        System.out.println("8 - Cubo");
        System.out.println("9 - Raiz quadrada");
        System.out.println("0 - Sair");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da Opção desejada: "));
        if (op == 0) {
            System.exit(0);
        }
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        float resul = opcao(op, num1, num2);
        JOptionPane.showMessageDialog(null, "O resultado foi " + resul);

    }

    static float opcao(int x, float b, float c) {
        float resul = 0;
        switch (x) {
            case 1:
                resul = b + c;

                break;

            case 2:
                resul = b - c;
                break;
            case 3:
                resul = b / c;
                break;
            case 4:
                resul = b * c;
                break;
            case 5:
                resul = b % c;
                break;
            case 6:
                resul = (b + c) * 2;
                break;
            case 7:
                resul = (b + c) * (b + c);
                break;
            case 8:
                resul = (b + c) * (b + c) * (b + c);
                break;
            case 9:
                resul = (float) Math.sqrt(b + c);
                break;

        }
        return resul;
    }
}
