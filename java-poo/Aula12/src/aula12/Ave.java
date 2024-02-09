/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Ave extends Animal {
    // Atributos
    
    protected String corPena;
    
    // Métodos
    
    public void fazerNinho() {
        System.out.println("Ave Fazendo ninho...");
    } 
    
    @Override
    public void locomover() {
        System.out.println("Ave voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave bicando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave cantando...");
    }
    
    // Métodos Especiais

}
