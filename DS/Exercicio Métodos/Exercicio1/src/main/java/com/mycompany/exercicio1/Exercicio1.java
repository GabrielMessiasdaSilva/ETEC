/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel 22
 */
public class Exercicio1 {
    static String aluno;
    public static void main(String[] args) {
  
        
         aluno=JOptionPane.showInputDialog(null,"Digite o seu nome:");
         float media;
         
         float nota1 =LerNota(); 
         float nota2 =LerNota();
         media = calcularmedia(nota1, nota2);
         if(media>=7)
             JOptionPane.showMessageDialog(null,"o aluno  "+aluno+" foi aprovado de ano");
         else
         JOptionPane.showMessageDialog(null,"o aluno  "+aluno+ " foi reprovado");
        
}
     
     static float LerNota()
     {
         
     return Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
     }
     
     static float calcularmedia(float n1, float n2)
     {
         
         return (n1+n2)/2;
     }
}
   

