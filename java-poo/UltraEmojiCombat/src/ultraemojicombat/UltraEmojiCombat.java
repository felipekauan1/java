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
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Felipe", "Brasil", 18, 1.81f, 64.5f, 11, 3, 1);
        l[0].apresentar();
        l[0].status();
        
        l[1] = new Lutador("Ana Luiza","Brasil", 12, 1.50f, 45f, 0, 0, 0);
        l[1].apresentar();
        l[1].status();
        
        l[2] = new Lutador("Brenão","Melada", 16, 1.82f, 70.9f, 8, 2, 3);
        l[2].apresentar();
        l[2].status();
        
        l[3] = new Lutador("Antonio","Ponte", 11, 1.55f, 117.8f, 1, 4, 7);
        l[3].apresentar();
        l[3].status();
        
        l[4] = new Lutador("Júlia","Brasil", 3, 0.80f, 34f, 0, 0, 0);
        l[4].apresentar();
        l[4].status();
    }
    
}
