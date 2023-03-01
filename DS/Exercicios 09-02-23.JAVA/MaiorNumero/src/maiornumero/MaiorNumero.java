/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiornumero;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class MaiorNumero {

    public static Scanner teclado = new Scanner(System.in);
    public static int n1;
    public static int n2;

    public static void main(String[] args) {
        System.out.println("Digite um valor");
        n1 = teclado.nextInt();
        System.out.println("Digite um segundo valor");
        n2 = teclado.nextInt();

        if (n2 < n1) {
            System.out.println("o primeiro valor é o maior" + n1);
        } else {
            if (n2 > n1) {
                System.out.println("o segundo valor é o maior" + n2);

            }
        }
    }
}
