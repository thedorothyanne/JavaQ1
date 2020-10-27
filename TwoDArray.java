/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy
 */
public class TwoDArray {
    
    public static void main(String[] args) {
    
        int[][] values = {
            { 10, 20, 30 }, 
            { 40, 50, 60 }, 
            { 70, 80, 90 },
            { 11, 21, 31 }
        };

      // Nested loops to print the array in tabular form.
       for (int row = 0; row < 4; row++) {
         
            for (int col = 0; col < 3; col++){
                System.out.print(values[row][col] + " ");
            }
       
            System.out.println();    // Print new line.
      }
      
      System.out.println("Value on 2nd row, 1st column: " + values[1][0]);
    
    }
}
