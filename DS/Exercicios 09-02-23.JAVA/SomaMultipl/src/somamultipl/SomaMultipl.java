/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somamultipl;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class SomaMultipl {

    /**
     * @param args the command line arguments
     */
    public static int impar;

    public static void main(String[] args) {

        for (int cont = 0; cont <= 30; cont++) {
            if (cont % 2 != 0) {
                impar = impar + cont;
            }
            if (cont % 2 == 0) {

            }
        }
        System.out.println(impar);
    }

}
