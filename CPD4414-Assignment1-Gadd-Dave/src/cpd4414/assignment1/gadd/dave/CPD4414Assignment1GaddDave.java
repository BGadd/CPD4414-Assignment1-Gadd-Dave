/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.gadd.dave;

/**
 *
 * @author c0641903
 */
public class CPD4414Assignment1GaddDave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("main method here.");
    }
    public static String stringPower(String s, int i){
        String result = "";
        if (i < 1) {
            result = null;
            System.out.println(result);
            return result;
        }
        if (s.equals("")) {
            System.out.println(result);
            return result;
        }
        for (int a = 0; a < i; a++) {
            result += s;
        }
        System.out.println(result);
        return result;
    }
    
}

