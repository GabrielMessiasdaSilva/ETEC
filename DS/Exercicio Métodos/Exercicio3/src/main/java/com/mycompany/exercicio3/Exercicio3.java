/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel 22
 */
public class Exercicio3 {

    public static void main(String[] args) {
        int sx = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu sexo o numero 1 para masculino  e 2 para feminino"));
        float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura(exemplo:1.75)"));

        if ((sx != 1) && (sx != 2)) {
            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente ");
            System.exit(0);

        }
        float c = calcularpesoideal(alt, sx);
        JOptionPane.showMessageDialog(null, "O seu peso ideal deve ser " + c);

    }

    static float calcularpesoideal(float al, int b) {
        float c = 0;
        if (b == 1) {
            c = (float) ((72.7 * al) - 58);

        } else {
            if (b == 2) {
                c = (float) ((62.1 * al) - 44.7);
            }
        }

        return c;
    }
}
