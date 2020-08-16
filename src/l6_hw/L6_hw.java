/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6_hw;

import java.util.Scanner;

/**
 *
 * @author nam57
 */
public class L6_hw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Test test = new Test (x,y,z);
        test.show();
        // TODO code application logic here
    }
    
}
