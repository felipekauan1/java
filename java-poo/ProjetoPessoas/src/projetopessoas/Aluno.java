/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Felipe
 */
public class Aluno extends Pessoas {
    // Atributos
    
    private int matricula;
    private String curso;
    
    // Métodos
    
    public void cancelarMatr() {
        this.matricula = 0;
        System.out.println("Matricula cancelada!");
    }
    
    // Getters e Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
