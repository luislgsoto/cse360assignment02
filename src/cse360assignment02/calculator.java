/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assignment02;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author user
 */
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        AddingMachine mycalculator = new AddingMachine();
        
        
        
        mycalculator.add(3);
        System.out.print(mycalculator.toString()+"\n");
        mycalculator.add(22);
        System.out.print("total: " + mycalculator.getTotal()+"\n");
        mycalculator.clear();
        mycalculator.subtract(10);
        System.out.print("total: " + mycalculator.getTotal());        
    }
    
}
