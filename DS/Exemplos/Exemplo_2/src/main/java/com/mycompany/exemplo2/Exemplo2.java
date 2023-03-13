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
    //Aqui declaramos o método principal porém como existe o Void siginifica que não trará nenhum retorno
    public static void main(String[] args) {
        int t;
        String p;
        digite(); //aqui temos a chamada do método Digite
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer:");
        t=tamanho(p); //aqui chmaremos o metodo tamanho 
        JOptionPane.showInputDialog(null,p+"possui"+t+ "caracteres");
    }

 static void digite() {
      JOptionPane.showInputDialog(null,"Digite uma palavra");
    }

 static int tamanho(String x) // Houve a chamada do metodo e a variavel foi trocada fazendo que aquele String P se tornasse a String X
 {
   return x.length(); //Temos o retorno que fará a contagem de quantos caracteres contem tal palavra
    }
    
}
