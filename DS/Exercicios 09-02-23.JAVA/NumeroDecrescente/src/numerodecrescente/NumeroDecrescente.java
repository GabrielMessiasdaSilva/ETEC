/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerodecrescente;

import java.util.Scanner;



/**
 *
 * @author dti
 */
public class NumeroDecrescente {


    public static Scanner teclado = new Scanner(System.in);
    public static void main (String [] args) {
    System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        System.out.println(numero);
        while(numero > 0){
             numero--;
            System.out.println(numero);
            if(numero == 0)
                break;
        }
    }
    
}

