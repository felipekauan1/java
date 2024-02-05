/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio09b;

/**
 *
 * @author Felipe
 */
public class Exercicio09b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Felipe", 18, "Masculino");
        p[1] = new Pessoa("Ana Luiza", 12, "Feminino");
        
        l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 367, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Gustavo Guanabara", 256, p[0]);
        l[2] = new Livro("Rapunzel", "Disney", 122, p[1]);
        
        l[1].abrir();
        l[1].avancarPag();
        l[1].detalhes();
    }
    
}
