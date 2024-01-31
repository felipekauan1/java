/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciobanco;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class ExercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(123456);
        p1.setDono("Felipe");
        
        System.out.print("Digite o tipo de conta que deseja abrir [CC/CP]: ");
        String tipoc = scanner.nextLine();
        switch (tipoc) {
            case "CC":
                p1.abrirConta("CC");
                break;
            case "CP":
                p1.abrirConta("CP");
                break;
            default:
                System.out.println("Tipo Inválido!");
        }
        p1.depositar(100);
        p1.sacar(5000);
            
        p1.statusDaConta();
        System.out.println("---------------------------------");
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(7891011);
        p2.setDono("Ana Luiza");
        
        p2.abrirConta("CC");
        
        p2.sacar(50);
        p2.fecharConta();
        p2.statusDaConta();
        
    }
    
}
