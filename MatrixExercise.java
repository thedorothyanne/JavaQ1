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

public class MatrixExercise {
    
    /** Method 1: main, what will run first upon execution of the program **/
    public static void main(String[] args) {
        
        // initialization of the 2D array
        int[][] twodm = {
            {10, 20, 30},
            {40, 50, 60}
        };
        
        // Display label and original array
        System.out.println("Original Array:"); 
        // method to print array with argument twodm consistent with the parameter of the method below.
        printArray(twodm); 
        
        // Display label and changed array
        System.out.println("Transposed Array:");
        // method to transpose array with argument twodm consistent with the parameter of the method below.
        transposeArray(twodm); // method to transpose array. See below.        
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
}