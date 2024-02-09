/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Mamifero extends Animal {
    // Atributos
    
    protected String corPelo;
    
    // Métodos
    
    @Override
    public void locomover() {
        System.out.println("Mamífero Andando...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamífero mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero...");
    }
    
    // Métodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
