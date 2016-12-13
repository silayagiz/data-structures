/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.reverse;

import datastructure.comparator.Application;
import datastructure.exception.DataStructureValidationException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author silayagiz
 */
public class Test {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        Scanner scanner = new Scanner(System.in);

    System.out.print ("Enter size of array: ");

    int n = scanner.nextInt();
    
    if(n <= 0 || n >= 1000) {
                try {
                    throw new DataStructureValidationException("Invalid size of array");
                } catch (DataStructureValidationException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

    String [] reversedArray = new String [n];

    System.out.print ("Enter elements:");

    for(int i = 0; i<n ;i++)
    {   
       reversedArray[i] = scanner.next();
    }
    
    
        System.out.println("Reverse Order of the given array:");
    
        reverseArray.arrayReverser(reversedArray);
    }
    
}
