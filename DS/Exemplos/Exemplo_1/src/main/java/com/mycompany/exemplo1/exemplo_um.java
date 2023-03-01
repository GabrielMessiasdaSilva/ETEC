/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class exemplo_um {
    public static void main(String[]args) //Aqui declaramos o método principal porém como existe o Void siginifica que não trará nenhum retorno
    {
        int a; //Declaração da variavel do tipo inteiro
        digite(); //nesse momento chamará o método digite que tambem não tem nenhum valor ou melhor nenhnum retorno
        a = Integer.parseInt (JOptionPane.showInputDialog("digite um numero"));// 
        dobro(a);// aqui chamaremos um outro método chamado dobro,esse ja recebe um "Valor" que é a variavel criada 
    } //aqui termina o método 

     static void digite() { //aqui está o primeiro método (digite)
       JOptionPane.showInputDialog(null,"Digite um numero"); //Aqui abrirá uma caixa de dialogo,no qual metodo main leu e retornou  
    }

     static void dobro(int n) {
        int d =n*2;
        JOptionPane.showInputDialog(null,"Dobro de" +n+ "é" +d);
    }
    
}
