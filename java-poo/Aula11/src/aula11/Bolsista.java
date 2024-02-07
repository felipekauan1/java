/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Felipe
 */
public class Bolsista extends Aluno {
    // Atributos
    
    private String bolsa;
    
    // Métodos
    
    public void renovarBolsa() {
        System.out.println("Bolsa renovada");
    }
    
    @Override
    public final void pagarMensalidade() {
        System.out.println("A mensalidade foi paga pela bolsa de estudos");
    }
    
    // Métodos Especiais

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
}
