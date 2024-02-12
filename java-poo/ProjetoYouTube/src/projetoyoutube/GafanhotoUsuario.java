/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Felipe
 */
public class GafanhotoUsuario extends Pessoa {
    // Atributos
    
    private String login;
    private int totAssistido;
    
    // Métodos
    
    @Override
    protected void ganharExp() {
        this.experiencia++;
    }
    
    public void viuMaisUm() {
        this.totAssistido++;
    }
    
    // Métodos Especiais

    public GafanhotoUsuario(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "GafanhotoUsuario{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
