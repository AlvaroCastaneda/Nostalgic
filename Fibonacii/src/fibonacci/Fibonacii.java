/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tank3
 */

public class Fibonacii {
    int a, b, c, d;
    static int e;
    Scanner sc;
    String cad;
    
    
    public Fibonacii(){
        sc = new Scanner(System.in);
        a = 0;
        b = 1;
        cad = " ";
    }
    
    public void leer(){
        do{
            System.out.println("Hasta que numero (entre 1 y 10,000)");
            c = sc.nextInt();
        }
        while(c <= 0 || c > 10000);
    }
    
    public void fibonaciiea(){
        if(c == 1){
            System.out.println("Tu secuencia es: 0");
        }
        else{
            for (int i = 0; i < c - 2; i++) {
                d = a + b;
                cad = cad + d + " ";
                a = b;
                b = d;
        }
            System.out.println("Tu secuencia es: 0 1" + cad);
            System.out.println("Otra vez? Si = 1 No = 2");
            e = sc.nextInt();
        }
    }
    
    public static void main(String[] args) {
       Fibonacii f = new Fibonacii();
       do{
            f.leer();
            f.fibonaciiea();
       }
       while(e == 1);
    }
    
}
