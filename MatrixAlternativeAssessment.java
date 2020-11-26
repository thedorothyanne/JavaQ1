/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy
 * FEW NOTES:
 * 1. Difference between argument and parameter:
 *      parameter: the values a method requires when it is called.
 *              i.e. the printArray method requires a 2D int array which it will locally call arr2d. arr2d is the parameter.
 *      argument: the actual value being passed to a method.
 *              i.e. in line 32, printArray is called and the array twodm is passed. Here, twodm is the argument.
 * 2. The methods printArray(arr2d) and transposeArray(arr2d) may be set to private because we will only use them
 *      inside the MatrixExercise class.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixAlternativeAssessment {
   
    // the inputs of the user for row and column respectively.
    // it is outside the main method (and other methods for this matter) and this means
    // that is is a GLOBAL variable and can be accessed inside all the methods in this class
    private static int n_row, n_col;
    
    // where the elements of the array will be stored
    private static int[][] rowColArray;
    
    // scanner for user input, also a global variable because it will be used in multiple methods
    private static Scanner scan = new Scanner(System.in); 
    
    /** Method 1: main, what will run first upon execution of the program **/
    public static void main(String[] args) {
        
        // User input for number of rows
        System.out.print("Enter no. of rows: ");
        n_row = scanNum();
        
        // User input for number of columns
        System.out.print("Enter no. of columns: ");
        n_col = scanNum();
        
        // User input for the actual elements
        rowColArray = scanArray();
       
        /** COMMENT IN ==========
        // initialization of the 2D array
        int[][] twodm = {
            {10, 20, 30},
            {40, 50, 60}
        }; 
        * END OF COMMENT ==========  **/
        
        // Display label and original array
        System.out.println("\nOriginal Array:"); 
        // method to print array with argument twodm consistent with the parameter of the method below.
        printArray(rowColArray); 
        
        // Display label and changed array
        System.out.println("Transposed Array:");
        // method to transpose array with argument twodm consistent with the parameter of the method below.
        transposeArray(rowColArray); // method to transpose array. See below.       
    }
    
    /** Method 2: main, what will run first upon execution of the program 
     * Parameter: arr2d, a two-dimensional array **/
    private static void printArray(int[][] arr2d) {
        
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /** Method 3: transposeArray, actual transposition of array **/
    private static void transposeArray(int[][] arr2d) {
        
        int[][] newtwodm = new int[arr2d[0].length][arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                newtwodm[j][i] = arr2d[i][j];
            }
        }
        printArray(newtwodm);
    }
    
    /** Method 4: scanNum, 
     * will try to scan an integer and if it fails (at the event
     * the user does not input an integer, it will fall under catch
     * if it succeeds, it will check again if integer is positive and return it if it is
     * NOTE that the return type is int because it will return the actual number scanned **/
    private static int scanNum() {
        
        try {
            int n = scan.nextInt();
            if(n>0) 
                return n;
            else {
                System.out.print("We need your input to > 0. Try again: ");
                scanNum();
            }
        } catch(InputMismatchException e) {
            System.out.print("Not an integer. Try again: ");
            scanNum();
        }
        return 0; // will not actually reach this
    }
    
    /** Method 5: scanArray, actual scanning of array 
     * will return the 2d array scanned **/
    private static int[][] scanArray() {
        
        // declaration and initialization of array
        int[][] arr2d = new int[n_row][n_col]; 
        
        // what we will display to the user when asking for input
        // remember i and j starts with 0 so they are off 1.
        int k, l = 0; // for display purposes only
        
        for(int i=0; i<n_row; i++) {
            for(int j=0; j<n_col; j++) {
                k = i + 1; l = j + 1;
                System.out.print("Enter element in row " + k + ", column " + l + ": ");
                arr2d[i][j] = scanNum();
            }
        }
        return arr2d;
    }
}