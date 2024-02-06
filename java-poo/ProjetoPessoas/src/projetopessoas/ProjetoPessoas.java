/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Felipe
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Felipe");
        p2.setNome("Ana Luiza");
        p3.setNome("Léo");
        p4.setNome("Buruti");
        
        p1.setIdade(18);
        p2.setIdade(12);
        p3.setIdade(22);
        p4.setIdade(14);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
