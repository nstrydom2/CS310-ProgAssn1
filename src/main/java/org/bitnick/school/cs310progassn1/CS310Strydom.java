/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * CS310Strydom - This class is designed to test the Broker
 *  and StockTrade classes.
 * @author Nicholas B. Strydom
 */
public class CS310Strydom {
    /**
     * Set's the variables for a Broker object
     * @param broker Broker object to set variables
     * @param brokerArray Array of values for the Broker object
     * @return The Broker object we have edited
     */
    public static Broker setBrokerAttributes(Broker broker, String[] brokerArray) {
        broker.setLicenseNum(brokerArray[0]);
        broker.setFirstName(brokerArray[1]);
        broker.setLastName(brokerArray[2]);
        broker.setDeptNum(brokerArray[3]);
        broker.setCommissionRate(Double.valueOf(brokerArray[4]));
        
        return broker;
    }

    /**
     * Displays all values as defined in the toString() method
     * @param broker Broker object in which to display variables and values
     */
    public static void displayBrokerAttributes(Broker broker) {
        System.out.println(broker.getLicenseNum());
        System.out.println(broker.getFirstName());
        System.out.println(broker.getLastName());
        System.out.println(broker.getDeptNum());
        System.out.println(broker.getCommissionRate());
    }

    /**
     * Set't the variables for a StockTrade object
     * @param stockTrade StockTrade object on which to set variables
     * @param tradeArray Array of values for the StockTrade object
     * @return StockTrade object
     */
    public static StockTrade setStockTradeAttributes(StockTrade stockTrade, String[] tradeArray) {
        stockTrade.setStockSymbol(tradeArray[0]);
        stockTrade.setPricePerShare(Double.valueOf(tradeArray[1]));
        stockTrade.setNumOfShares(Integer.valueOf(tradeArray[2]));
        stockTrade.setBrokersLicenseNum(tradeArray[3]);
        stockTrade.setIsTaxable(Boolean.valueOf(tradeArray[4]));
        
        return stockTrade;
    }

    /**
     * Displays all values as defined in the toString() method
     * @param stockTrade StockTrade object in which to display variables and values
     */
    public static void displayStockTradeAttributes(StockTrade stockTrade) {
        System.out.println(stockTrade.getStockSymbol());
        System.out.println(stockTrade.getPricePerShare());
        System.out.println(stockTrade.getNumOfShares());
        System.out.println(stockTrade.getBrokersLicenseNum());
        System.out.println(stockTrade.isTaxable());
    }

    /**
     * Point of execution
     * @param args Command line args
     */
    public static void main(String[] args) {
        // Test 1a
        System.out.println("Running Test 1a:");
        
        Broker test1Broker = new Broker("ABC12345", "Bob", "Dole", "32", 2.4);
        System.out.println(test1Broker.toString());
        
        // Test 1b
        System.out.println();
        System.out.println("Running Test 1b:");
        
        StockTrade test1StockTrade = new StockTrade("SBTC", 7344.00, 82, "BTC81234", true);
        System.out.println(test1StockTrade.toString());
        
        // Test 2a
        System.out.println();
        System.out.println("Running Test 2a:");
        
        Broker test2Broker = new Broker("ABC12345", "Bob", "Dole", "32", 2.4);
        System.out.println(test2Broker.toString());
        
        if (test2Broker.equals(test1Broker)) {
            System.out.println("First and second Broker objects are equal");
        } else {
            System.out.println("First and second Broker objects are NOT equal");
        }
        
        // Test 2b
        System.out.println();
        System.out.println("Running Test 2b:");
        
        Broker test2bBroker = new Broker("AAA11111", "Jim", "Lahey", "32", 2.4);
        System.out.println(test2bBroker.toString());
        
        if (test2bBroker.equals(test1Broker)) {
            System.out.println("First and third Broker objects are equal");
        } else {
            System.out.println("First and third Broker objects are NOT equal");
        }
        
        // Test 2c
        System.out.println();
        System.out.println("Running Test 2c:");
        
        StockTrade test2StockTrade = new StockTrade("SBTC", 7344.00, 82, "BTC81234", true);
        System.out.println(test2StockTrade.toString());
        
        if (test2StockTrade.equals(test1StockTrade)) {
            System.out.println("First and second StockTrade objects are equal");
        } else {
            System.out.println("First and second StockTrade objects are NOT equal");
        }
        
        // Test 2d
        System.out.println();
        System.out.println("Running Test 2d:");
        
        StockTrade test2dStockTrade = new StockTrade("ETH", 800.00, 82, "BTC81234", true);
        System.out.println(test2StockTrade.toString());
        
        if (test2dStockTrade.equals(test1StockTrade)) {
            System.out.println("First and third StockTrade objects are equal");
        } else {
            System.out.println("First and third StockTrade objects are NOT equal");
        }
        
        // Test 3
        System.out.println();
        System.out.println("Running Test 3:");
        
        final String INPUT_FILE_PATH = "/home/ghost/NetBeansProjects/CS310ProgAssn1/input/assn1input1.txt";
        
        try (Scanner fileScanner = new Scanner(new File(INPUT_FILE_PATH))) {
            while (fileScanner.hasNextLine()) {
                try {
                    String[] line = fileScanner.nextLine().split(",");

                    if (line[0].equals("BROKER")) {
                        Broker broker = setBrokerAttributes(new Broker(), Arrays.copyOfRange(line, 2, line.length));

                        if (line[1].equals("ADD")) {
                            System.out.println("ADDING BROKER");
                            System.out.println(broker.toString());
                            
                            if (!broker.isValidLicense())
                                throw new Exception("Invalid broker license number format: " + broker.getLicenseNum());
                            
                            if (!broker.isValidDept())
                                throw new Exception("Invalid department number format: " + broker.getDeptNum());
                            
                            displayBrokerAttributes(broker);
                            
                        } else if (line[1].equals("DEL")) {
                            System.out.println("DELETING BROKER");
                            System.out.println(broker.toString());

                            if (!broker.isValidLicense())
                                throw new Exception("Invalid broker license number format: " + broker.getLicenseNum());

                            if (!broker.isValidDept())
                                throw new Exception("Invalid department number format: " + broker.getDeptNum());

                        }
                    } else if (line[0].equals("TRADE")) {
                        StockTrade stockTrade =
                                setStockTradeAttributes(new StockTrade(), Arrays.copyOfRange(line, 2, line.length));

                        if (line[1].equals("ADD")) {
                            System.out.println("BUYING STOCK");
                            System.out.println(stockTrade.toString());

                            // Weird hacky validation because off time crunch, sorry
                            if (!new Broker(stockTrade.getBrokersLicenseNum(), "", "", "", 0.0).isValidLicense())
                                throw new Exception("Invalid broker licence number format: " + stockTrade.getBrokersLicenseNum());

                            if (!stockTrade.isValidSymbol())
                                throw new Exception("Invalid broker licence number format: " + stockTrade.getStockSymbol());

                            if (!stockTrade.isValidPrice())
                                throw new Exception("Invalid share price: " + stockTrade.getPricePerShare());

                            if (!stockTrade.isValidNumOfShares())
                                throw new Exception("Invalid number of shares: " + stockTrade.getNumOfShares());

                        } else if (line[1].equals("DEL")) {
                            System.out.println("SELLING STOCK");
                            System.out.println(stockTrade.toString());

                            // Weird hacky validation because off time crunch, sorry
                            if (!new Broker(stockTrade.getBrokersLicenseNum(), "", "", "", 0.0).isValidLicense())
                                throw new Exception("Invalid broker licence number format: " + stockTrade.getBrokersLicenseNum());

                            if (!stockTrade.isValidSymbol())
                                throw new Exception("Invalid broker licence number format: " + stockTrade.getStockSymbol());

                            if (!stockTrade.isValidPrice())
                                throw new Exception("Invalid share price: " + stockTrade.getPricePerShare());

                            if (!stockTrade.isValidNumOfShares())
                                throw new Exception("Invalid number of shares: " + stockTrade.getNumOfShares());

                        }
                        //System.out.println();
                    }
                } catch (Exception ex) {
                    System.out.println(String.format("ERROR: %s\n", ex.getMessage()));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("\'" + INPUT_FILE_PATH + "\' could not be found!");
            System.exit(1);
        }
    }
}
