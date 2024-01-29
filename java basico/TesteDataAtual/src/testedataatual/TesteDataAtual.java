/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testedataatual;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public class TesteDataAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dataAtual = new Date();
        System.out.println(dataAtual);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAtual);
        int horaAtual = calendar.get(Calendar.HOUR);
        System.out.println("A hora atual é " + horaAtual + " horas!");
    }
    
}
