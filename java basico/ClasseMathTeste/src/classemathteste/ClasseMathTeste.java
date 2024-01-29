/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classemathteste;

/**
 *
 * @author Felipe
 */
public class ClasseMathTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float resul = (float) Math.pow(10,2);
        System.out.println("O resultado é " + resul);
        
        float valor = (float) 6.21;
        int arredondado = (int) Math.round(valor);
        System.out.println("O valor é " + arredondado);
        
        float aleat = (float) Math.random();
        System.out.println("O numero gerado é: " + aleat);
    }
    
}
