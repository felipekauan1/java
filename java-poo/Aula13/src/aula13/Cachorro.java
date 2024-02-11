/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author Felipe
 */
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    // Polimorfismo de Sobrecarga
    
    public void reagir(String frase) {
        if (frase.equals("Agradável")) {
            System.out.println("Chachorro Abana o rabo e late!");
        } else {
            System.out.println("Cachorro rosna!");
        }
    }
    
    public void reagir(int horario) {
        if (horario <= 12) {
            System.out.println("Abana o rabo!");
        } else if (horario >= 18) {
            System.out.println("Ignora!");
        } else {
            System.out.println("Abana o rabo e late!");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abana o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade <= 5 && peso <= 10) {
            System.out.println("Abanar");
        } else if (idade <= 5 && peso > 10) {
            System.out.println("Latir");
        } else if (idade > 5 && peso <= 10) {
            System.out.println("Rosnar");
        } else if (idade > 5 && peso > 10) {
            System.out.println("Ignorar");
        }
    }
    
}
