/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcfor;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class CalcFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v;
        String continuar;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número que você deseja ver a taboada: ");
            v = scanner.nextInt();
            for (int c = 0; c<=10; c++) {          
                System.out.println(v + " x " + c + " = " + v*c);
            }
            System.out.println("Quer continuar? [S/N] ");
            continuar = scanner.next();
        } while (continuar.equals("S") || continuar.equals("s"));
    }
    
}
