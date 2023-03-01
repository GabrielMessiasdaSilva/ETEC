/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Media {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String Aluno;
        double n1, n2, n3, n4, media;
        System.out.print("Consulta de notas\n ");
        System.out.print("Componente: Matemática\n ");
        System.out.print("Digite o seu nome: ");
        Aluno = teclado.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a segunda nota: ");
        n2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a terceira nota: ");
        n3 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a quarta nota: ");
        n4 = Double.parseDouble(teclado.nextLine());
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média do aluno:  " + Aluno + " na matéria de matemática foi: " + media);

    }
}
