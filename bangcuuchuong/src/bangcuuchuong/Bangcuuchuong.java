/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangcuuchuong;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bangcuuchuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        System.out.println("Bang cuu chuong");
        
        for (int i=1; i<10; i++)
        {n =i;
        System.out.println(i +"x" + n + "=" + (i*n++));
                 
        }
        
    }
    
}
