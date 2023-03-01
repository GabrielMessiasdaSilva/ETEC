/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparanumero;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class ComparaNumero {

    public static Scanner teclado = new Scanner(System.in);
    public static int n1;
    public static int n2;

    public static void main(String[] args) {
        System.out.println("Digite um valor");
        n1 = teclado.nextInt();
        System.out.println("Digite um segundo valor");
        n2 = teclado.nextInt();
        if (n1 == n2) {
            System.out.println("Numeros iguais");

        } else {
            System.out.println("Numeros Diferentes");
        }
        if (n1 > n2) {
            System.out.println("O valor maior é " + n1 + "  O valor menor é" + n2);
        } else {
            if (n1 < n2) {
                System.out.println("O valor maior é " + n2 + "  O valor menor é" + n1);
            }
        }

    }
}
