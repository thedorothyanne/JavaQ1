/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy
 */
import java.util.Scanner;

public class ArraySample {
    
    public static void main(String[] args) {
        
        // COMMENT THIS OUT
        //accessingArrays();
        // =================== Dito niyo gawin yung next na ipapagawa ko =====================
        
        Scanner scan = new Scanner(System.in);
        
        int[] inputs = new int[10];
        for(int i=0; i<10; i++) {
            System.out.print("Input " + i + ": ");
            inputs[i] = scan.nextInt();
        }
        
        System.out.println("Here are the inputs: ");
        for(int i=0; i<10; i++) {
            System.out.print(inputs[i] + ", ");
        }
        
    }
    
    public static void accessingArrays() {
        // create an array
        // THIS PART HERE IS WHERE WE ARE DECLARING AND INITIALIZING AT THE SAME TIME
        int[] age = {12, 4, 5, 2, 5};
        
        // ITO YUNG DECLARATION LANG. WE ARE TELLING THE COMPILER THAT
        // THIS IS AN ARRAY OF TYPE INT WITH THE NAME 'AGE' WITH 5 ELEMENTS
        //int[] age = new int[5];

        // access each array elements
        // AND THIS IS HOW WE ACCESS THE ELEMENTS OF THE ARRAY
        // IT STARTS WITH 0. 
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
    
    
    
}
