/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy
 */
public class ThreeDArray {
    
    public static void main(String[] args) {
    
        String[][][] sampleArray = {
            
            // Class 1
            {
                {"Dorothy", "Sean", "LA"},
                {"Shannen", "Gabrielle", "Kaye"},
                {"Marian", "Amir"}    
            },
            
            // Class 2
            {
                {"Dorothy1", "Sean1", "LA1"},
                {"Shannen1", "Gabrielle1", "Kaye1"}
            }
        };
        
        for(int i=0; i<sampleArray.length; i++) {
            
            System.out.println("Class: " + i);
            for(int j=0; j<sampleArray[i].length; j++) {
            
                for(int k=0; k<sampleArray[i][j].length; k++) {
                
                    System.out.print(sampleArray[i][j][k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
