/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Exemplo_4 {
    public static void main(String[] args) //Aqui declaramos o método principal porém como existe o Void siginifica que não trará nenhum retorno
    {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
        
        if(RestoPorDois(num)==0)
            JOptionPane.showInputDialog(null,"O número é par.\n");
        else
            JOptionPane.showInputDialog(null,"o Número é impar.\n");
 }
    static int RestoPorDois(int a)
    {
        return a %2;
    }
}
