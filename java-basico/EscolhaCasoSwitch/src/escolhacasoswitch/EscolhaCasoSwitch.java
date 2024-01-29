/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escolhacasoswitch;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class EscolhaCasoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escolha caso
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pernas: ");
        int pernas = scanner.nextInt();
        String tipo;
        switch(pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Galinha";
                break;
            case 4:
                tipo = "Cavalo";
                break;
            default:
                tipo = "Aranha ET";         
        }
        System.out.println("O tipo é " + tipo);
    }
    
}
