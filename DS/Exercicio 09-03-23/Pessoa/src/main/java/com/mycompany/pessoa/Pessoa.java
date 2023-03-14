/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Pessoa {

    private String nome;
    private String endereço;
    private String telefone;
    //Inicializa os atributos com valores passados por parametros    

    public Pessoa(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }
public void apresentarPessoa(){
     JOptionPane.showMessageDialog(null,"Dados cadastrados ");
     JOptionPane.showMessageDialog(null,"o nome digitado foi :  " +this.getNome());
     JOptionPane.showMessageDialog(null,"o endereço digitado foi:  " +this.getEndereço());
    JOptionPane.showMessageDialog(null,"o  telefone digitado foi : "+this.getTelefone());
     JOptionPane.showMessageDialog(null,"Obrigado!! ");
}
    public void inserirDadosPessoa(){
        this.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
       this.setEndereço(JOptionPane.showInputDialog("Digite o seu Endereço"));
       this.setTelefone(JOptionPane.showInputDialog("Digite o seu telefone"));
    }

}

