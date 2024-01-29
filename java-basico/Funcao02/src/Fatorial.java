/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Felipe
 */
public class Fatorial {
    
    private static int num = 0;
    private static int fat = 1;
    private static String formula = "";
    
    public static void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for (int c=n; c>1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public static int getFatorial() {
        return fat;
    }
    
    public static String getFormula() {
        return formula;
    }
}
