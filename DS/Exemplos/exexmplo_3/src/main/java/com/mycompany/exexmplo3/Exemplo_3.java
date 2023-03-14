/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exexmplo3;

import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Exemplo_3 {

    public static void main(String[] args) 
    {
        int idade1, idade2; 
        String nome1, nome2;

        nome1 = JOptionPane.showInputDialog("Digite o nome da 1° pessoa ");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1° pessoa:"));

        nome2 = JOptionPane.showInputDialog("digite o nome da 2°pessoa :");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2° pessoa:"));

        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
        JOptionPane.showInputDialog(null, texto);
    }

    static String PessoaMaisVelha(String n1, int id1, String n2, int id2) // aqui temos o método e como aconteceu no exemplo 3,os paramentros que tem uma variavel foi trocado 
    {
        {
            if (id1 > id2) //temos a estrutura condicional 
                return n1 + " É"
                        + ""
                        + ""
                        + " a pessoa mais velha";
           else 
                if (id2 > id1) 
                   return n2 + " É a pessoa mais velha";
             else 
                  
                return n1 + "e" + n2 + "tem a mesma idade"; //e aqui temos o retorno o qual o método leu 
            

        }
    }
}


