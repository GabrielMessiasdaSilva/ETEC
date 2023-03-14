/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel 22
 */
public class Exercicio2 {

    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero"));
        float y = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: "));
        float d = diferenca(x, y);
        JOptionPane.showMessageDialog(null, "A diferença do maior para o menor foi " + d);

    }

    static float diferenca(float a, float b) {

        float d = 0;
        if (a > b) {
            d = a - b;

        } else {
            if (b >= a) {
                d = b - a;
            }

        }
        return d;
    }

}
