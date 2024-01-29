/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Azul";
        c2.ponta = 0.5f;
        c2.carga = 50;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
