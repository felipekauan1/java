/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetorepita;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class ProjetoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resp;
        int n, s = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
            s += n;
            System.out.print("Você quer continuar? [S/N]: ");
            resp = scanner.next();           
        } while (resp.equals("S"));  
        System.out.println("A soma de todos os números é: " + s);
    }
    
}
