/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Nicholas B. Strydom
 */
public class CS310Lastname {
    public static void setBrokerAttributes() {
        
    }
    
    public static void displayBrokerAttributes() {
        
    }
    
    public static void setStockTradeAttributes() {
        
    }
    
    public static void displayStockTradeAttributes() {
        
    }
    
    public static void main(String[] args) {
        final String INPUT_FILE_PATH = "/home/ghost/NetBeansProjects/CS310ProgAssn1/testData.csv";
        
        try (Scanner fileScanner = new Scanner(new File(INPUT_FILE_PATH))) {
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
