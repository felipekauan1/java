/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Reptil extends Animal {
    // Atributos
    
    protected String corEscama;
    
    // Métodos
    
    @Override
    public void locomover() {
        System.out.println("Reptil rasteigando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil se alimentando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Reptil emitindo som...");
    }
    
    // Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
