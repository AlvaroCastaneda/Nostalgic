/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

/**
 *
 * @author tank3
 */
public class Poligonos {
    long N, n, c;
    Scanner sc = new Scanner(System.in);
    
    public Poligonos(){
        c = 1;
    }
    
    public void saca(){
        while(true){
            System.out.println("Diagonales");
            N = sc.nextLong();
            if(N == 0)
                break;
                n = (long)(3 + Math.sqrt(9.0 + 8.0 * (N - 1))/2);
        System.out.println("Case " + c + ": " + (n));
        c++;
            
        }
    }
    
    public static void main(String[] args) {
       Poligonos p = new Poligonos();
       p.saca();
    }
    
}
