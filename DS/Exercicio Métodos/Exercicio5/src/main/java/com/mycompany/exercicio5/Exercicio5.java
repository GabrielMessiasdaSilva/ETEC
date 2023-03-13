/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel 22
 */
public class Exercicio5 {

    public static void main(String[] args) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do Triângulo"));
        float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Triângulo"));
        float hipotenusa = hipotenusa(base, alt);
        JOptionPane.showMessageDialog(null, "O resultado da hipotenusa é " + hipotenusa);
    }

    static float hipotenusa(float x, float y) {
        float hip1 = (x * x) + (y * y);
        float hip = (float) Math.sqrt(hip1);
        return hip;
    }

}
