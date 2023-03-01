/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer:");
        t=tamanho(p);
        JOptionPane.showInputDialog(null,p+"possui"+t+ "caracteres");
    }

 static void digite() {
      JOptionPane.showInputDialog(null,"Digite uma palavra");
    }

 static int tamanho(String x) {
   return x.length();
    }
    
}
