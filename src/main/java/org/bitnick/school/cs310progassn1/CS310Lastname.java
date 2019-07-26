/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
        
        List<Broker> brokers = new ArrayList<Broker>();
        
        try (Scanner fileScanner = new Scanner(new File(INPUT_FILE_PATH))) {
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(",");
                
                Broker broker = new Broker();
                broker.setLicenseNum(line[0]);
                broker.setFirstName(line[1]);
                broker.setLastName(line[2]);
                broker.setDeptNum(line[3]);
                broker.setCommissionRate(Double.valueOf(line[4]));
                
                brokers.add(broker);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        // Test 1a
        System.out.println("Running Test 1a:");
        
        // Test 1b
        System.out.println("Running Test 1b:");
        
        // Test 2a
        System.out.println("Running Test 2a:");
        
        // Test 2b
        System.out.println("Running Test 2b:");
        
        // Test 2c
        System.out.println("Running Test 2c:");
        
        // Test 2d
        System.out.println("Running Test 2d:");
        
        // Test 3
        System.out.println("Running Test 3:");
        
        
    }
}
