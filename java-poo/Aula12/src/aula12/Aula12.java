/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
       
        // Mamífero
        
        m.setPeso(150.3f);
        m.setIdade(15);
        m.setMembros(4);
        m.setCorPelo("Marrom");
        
        System.out.println("Mamífero");
        System.out.println(m.getPeso());
        System.out.println(m.getIdade());
        System.out.println(m.getMembros());
        System.out.println(m.getCorPelo());
        
        m.locomover();
        
        // Canguru
        
        Canguru can = new Canguru();
    
        can.setPeso(80f);
        can.setIdade(14);
        can.setMembros(2);
        can.setCorPelo("Amarelo");
        
        System.out.println("");
        System.out.println("Mamífero Canguru");
        System.out.println(can.getPeso());
        System.out.println(can.getIdade());
        System.out.println(can.getMembros());
        System.out.println(can.getCorPelo());
        
        can.locomover();
    }
    
}
