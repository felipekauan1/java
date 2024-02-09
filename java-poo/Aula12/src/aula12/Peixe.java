/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Peixe extends Animal {
    // Atributos
    
    protected String corEscama;
    
    // Métodos
    
    public void soltarBolha() {
        System.out.println("Peixe Soltando bolha...");
    }
    
    @Override
    public void locomover() {
        System.out.println("Peixe Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som...");
    }    
    
    // Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
