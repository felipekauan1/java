/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Felipe
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Transformando um INTEIRO em uma STRING */
        int nota = 33645457;
        String valor = Integer.toString(nota);
        System.out.println("O valor da nota é: " + valor);
               
        /* Transformando uma STRING em um INTEIRO */
        String letra = "5";
        int numero = Integer.parseInt(letra);
        System.out.println("O valor da letra é " + numero);
    }
    
}
