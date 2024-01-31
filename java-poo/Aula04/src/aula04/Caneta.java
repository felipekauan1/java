/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Felipe
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampado;
    private String cor;
    
    public Caneta(String m, float p, String c) { // Este é o método construtor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {       
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {       
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampado = true;
    }
    
    public void destampar() {
        this.tampado = false;
    }
    
    public void status() {       
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Tampado: " + this.tampado);
        System.out.println("Cor: " + this.cor);
    }
}
