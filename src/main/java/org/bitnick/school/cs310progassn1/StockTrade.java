/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

/**
 *
 * @author Nicholas B. Strydom
 */
public class StockTrade {
    private String stockSymbol;
    private double pricePerShare;
    private int numOfShares;
    private String brokersLicenseNum;
    private boolean isTaxable;
    
    public StockTrade() {}

    /**
     * @return the stockSymbol
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * @param stockSymbol the stockSymbol to set
     */
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    /**
     * @return the pricePerShare
     */
    public double getPricePerShare() {
        return pricePerShare;
    }

    /**
     * @param pricePerShare the pricePerShare to set
     */
    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    /**
     * @return the numOfShares
     */
    public int getNumOfShares() {
        return numOfShares;
    }

    /**
     * @param numOfShares the numOfShares to set
     */
    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    /**
     * @return the brokersLicenseNum
     */
    public String getBrokersLicenseNum() {
        return brokersLicenseNum;
    }

    /**
     * @param brokersLicenseNum the brokersLicenseNum to set
     */
    public void setBrokersLicenseNum(String brokersLicenseNum) {
        this.brokersLicenseNum = brokersLicenseNum;
    }

    /**
     * @return the isTaxable
     */
    public boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * @param isTaxable the isTaxable to set
     */
    public void setIsTaxable(boolean isTaxable) {
        this.isTaxable = isTaxable;
    }
    
}
