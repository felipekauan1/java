/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float n1 = input.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        float n2 = input.nextFloat();  
        float media = (n1 + n2)/2;
        System.out.println("A sua media foi de: " + media);
        if (media >= 9) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Infelizmente você foi reprovado!");
        }
    }
    
}
