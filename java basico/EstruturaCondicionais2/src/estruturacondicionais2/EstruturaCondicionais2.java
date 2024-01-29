/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacondicionais2;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class EstruturaCondicionais2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        int idade = 2024 - anoNasc;
        System.out.println("Sua idade é: " + idade);
        if (idade<16) {
            System.out.println("Não vota!");
        } else if ((idade>=16 && idade<18) || (idade>70)) {
                System.out.println("Voto opcional!");
        } else {
            System.out.println("Voto obrigatório!");
        }
    }
    
}
