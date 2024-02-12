/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Felipe
 */
public class Video implements AcoesVideo {
    // Atributos
        
    private String titulo;
    private int avaliacoes;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Polimorfismo de Sobreposição

    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println("Video em reprodução.");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("Video Pausado.");
    }

    @Override
    public void like() {   
        this.curtidas++;
        System.out.println("Like!");
    }
    
    // Métodos Especiais

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacoes=" + avaliacoes + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
