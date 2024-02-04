/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Felipe
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Felipe", "Brasil", 18, 1.81f, 64.5f, 1, 1, 1);
        l[0].apresentar();
        l[0].status();
        
        l[1] = new Lutador("Ana Luiza","Brasil", 12, 1.50f, 45f, 1, 1, 1);
        l[1].apresentar();
        l[1].status();
        
        l[2] = new Lutador("Brenão","Melada", 16, 1.82f, 70.9f, 1, 1, 1);
        l[2].apresentar();
        l[2].status();
        
        l[3] = new Lutador("Antonio","Ponte", 11, 1.55f, 117.8f, 1, 1, 1);
        l[3].apresentar();
        l[3].status();
        
        l[4] = new Lutador("Júlia","Brasil", 3, 0.80f, 34f, 1, 1, 1);
        l[4].apresentar();
        l[4].status();
        
        l[5] = new Lutador("Leozin","Brasil", 22, 1.70f, 60f, 1, 1, 1);
        l[5].apresentar();
        l[5].status();
        
        Luta uec1 = new Luta();
        uec1.marcarLuta(l[4], l[1]);
        uec1.lutar();
        
        l[4].status();
        l[1].status();
    }   
}
