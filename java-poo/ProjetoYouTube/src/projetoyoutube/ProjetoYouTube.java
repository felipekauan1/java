/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Felipe
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 14 de POO");
        v[1] = new Video("Aula 14b de POO");
        v[2] = new Video("Aula 15b de POO");
        
        /* System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString()); */
        
        GafanhotoUsuario g1 = new GafanhotoUsuario("Primeiro Login", "Felipe", 18, "M");
        GafanhotoUsuario g2 = new GafanhotoUsuario("Segundo Login", "Ana Luiza", 12, "F");
        
        /* System.out.println("");
        System.out.println(g1.toString());
        System.out.println(g2.toString()); */
        
        System.out.println("");
        Vizualizacao vis[] = new Vizualizacao[3];
        
        vis[0] = new Vizualizacao(g1, v[0]);
        vis[0].curtirvideo();
        vis[0].avaliar(80);
        System.out.println(vis[0].toString());
        
        vis[1] = new Vizualizacao(g1, v[1]);
        vis[1].avaliar(94.0f);
        System.out.println(vis[1].toString());      
        
        vis[2] = new Vizualizacao(g2, v[2]);
        vis[2].curtirvideo();
        vis[2].avaliar();
        System.out.println(vis[2].toString());
        
    }
    
}
