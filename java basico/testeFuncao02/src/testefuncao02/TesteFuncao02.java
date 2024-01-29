/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author Felipe
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b, int c) {
        int s = a+b+c;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int retorno = soma(4,1,6);
        System.out.println(retorno);
    }
    
}
