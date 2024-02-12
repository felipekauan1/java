/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Felipe
 */
public class Vizualizacao {
    // Atributos
    
    private GafanhotoUsuario espectador;
    private Video filme;
    
    // Métodos
    
    public void avaliar() {
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + 5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + nota);
    }
    
    public void avaliar(float porc) {
        int tot;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacoes(this.filme.getAvaliacoes() + tot);
        
    }
    
    public void curtirvideo() {
        this.filme.setCurtidas(this.getFilme().getCurtidas() + 1);
    }
    
    // Métodos Especiais

    public Vizualizacao(GafanhotoUsuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public GafanhotoUsuario getEspectador() {
        return espectador;
    }

    public void setEspectador(GafanhotoUsuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
