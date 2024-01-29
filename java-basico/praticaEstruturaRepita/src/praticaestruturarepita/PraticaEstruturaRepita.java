/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticaestruturarepita;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class PraticaEstruturaRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v, n, c=0, totpares=0, totimpares=0, maior100=0, soma=0;
        float media;
        
        Scanner scanner = new Scanner(System.in);
        
        do {          
            System.out.print("Digite um valor? o número 0 para a execusão: ");
            v = scanner.nextInt();
            
            if (v!=0) {
                c++;
            }
            
            if (v!=0 && v%2==0) {
                totpares++;
            } else if (v!=0) {
                totimpares++;
            }
            
            if (v!=0 && v>100) {
                maior100++;
            }
            
            if (v!=0) {
                soma += v;               
            }
            
            media = soma/c;
            
        } while (v != 0);
        System.out.println("------------------------------------");
        System.out.println("Total de valores: " + c);
        System.out.println("Total de pares: " + totpares);
        System.out.println("Total de impares: " + totimpares);
        System.out.println("Acima de 100: " + maior100);
        System.out.println("Média dos valores: " + media);
    }
    
}
