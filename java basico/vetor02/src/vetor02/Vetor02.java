/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Felipe
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan", "fev", "mar", "abril", "maio", "junho", "julho", "ago", "set", "out", "nov", "dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c = 0; c < tot.length; c++) {
            System.out.println("O mês " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }
    
}
