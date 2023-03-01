/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocanumero;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class TrocaNumero {

    /**
     * @param args the command line arguments
     */
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

                
        int NumA, NumB,;

        System.out.print("Digite um número: ");

        NumA = teclado.nextInt();

        System.out.println(" ");

        System.out.print("Digite um  segundo número: ");

        NumB = teclado.nextInt();

        System.out.println(" ");

        System.out.println(NumB);

        System.out.print(NumA);

        System.out.println(" ");
       
                
    }
}
