/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Felipe
 */
public class Funcionario extends Pessoas {
    // Atributos
    
    private String setor;
    private boolean trabalhando;
    
    // Métodos
    
    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }
    
    // Getters e Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
