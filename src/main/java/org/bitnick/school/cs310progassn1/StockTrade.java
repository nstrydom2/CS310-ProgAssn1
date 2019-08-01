/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

import java.util.Objects;

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
    
    public StockTrade(String stockSymbol, double pricePerShare, int numOfShares,
            String brokersLicenseNum, boolean isTaxable) {
        this.stockSymbol = stockSymbol;
        this.pricePerShare = pricePerShare;
        this.numOfShares = numOfShares;
        this.brokersLicenseNum = brokersLicenseNum;
        this.isTaxable = isTaxable;
    }

    /**
     * Validator for checking stock symbol is uppercase, and that the length
     * is either 3 or 4
     * @return boolean value of if valid or not
     */
    public boolean isValidSymbol() {
        if (this.stockSymbol.length() < 3 || this.stockSymbol.length() > 4) {
            return false;
        } else {
            for (Character character : stockSymbol.toCharArray()) {
                if (!Character.isUpperCase(character))
                    return false;
            }
        }

        return true;
    }

    /**
     * Validator for checking if price is below 1,000.00 a share
     * @return boolean value of if valid or not
     */
    public boolean isValidPrice() {
        if (this.pricePerShare > 1000.00)
            return false;

        return true;
    }

    /**
     * Validator for checking if the number of shares does not
     * exceed 100,000
     * @return boolean value of if valid or not
     */
    public boolean isValidNumOfShares() {
        if (this.numOfShares > 100000)
            return false;

        return true;
    }

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
    public boolean isTaxable() {
        return isTaxable;
    }

    /**
     * @param isTaxable the isTaxable to set
     */
    public void setIsTaxable(boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StockTrade other = (StockTrade) obj;
        if (Double.doubleToLongBits(this.pricePerShare) != Double.doubleToLongBits(other.pricePerShare)) {
            return false;
        }
        if (this.numOfShares != other.numOfShares) {
            return false;
        }
        if (this.isTaxable != other.isTaxable) {
            return false;
        }
        if (!Objects.equals(this.stockSymbol, other.stockSymbol)) {
            return false;
        }
        if (!Objects.equals(this.brokersLicenseNum, other.brokersLicenseNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockTrade{" + "stockSymbol=" + stockSymbol + ", pricePerShare=" + pricePerShare + ", numOfShares=" + numOfShares + ", brokersLicenseNum=" + brokersLicenseNum + ", isTaxable=" + isTaxable + '}';
    }
}
