/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bitnick.school.cs310progassn1;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author Nicholas B. Strydom
 */
public class Broker {
    private String licenseNum;
    private String firstName;
    private String lastName;
    private String deptNum;
    private double commissionRate;
    
    public Broker() {}
    
    public Broker(String licenseNum, String firstName, String lastName, 
            String deptNum, double commissionRate) {
        this.licenseNum = licenseNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNum = deptNum;
        this.commissionRate = commissionRate;
    }
    
    @Deprecated
    public boolean isValidLicense(boolean deprecated) {            
        if (licenseNum.length() != 8) {
            return false;
        } else {
            for (Character character : licenseNum.toCharArray()) {
                if (licenseNum.indexOf(character) < 3 &&
                        !Character.isLetter(character)) {
                    return false;
                } else if (licenseNum.indexOf(character) >= 3 &&
                        !Character.isDigit(character)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isValidLicense() {     
        if (!Pattern.matches("^[A-z]{3}[0-9]{5}$", licenseNum)) {
            return false;
        }
        
        return true;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isValidDept() {
        if (!Pattern.matches("^[1-3]{3}-[1-3]{3}$", lastName)) {
            return false;
        }
       
        return true;
    }

    /**
     * @return the licenseNum
     */
    public String getLicenseNum() {
        return licenseNum;
    }

    /**
     * @param licenseNum the licenseNum to set
     */
    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the deptNum
     */
    public String getDeptNum() {
        return deptNum;
    }

    /**
     * @param deptNum the deptNum to set
     */
    public void setDeptNum(String deptNum) {
        this.deptNum = deptNum;
    }

    /**
     * @return the commissionRate
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * @param commissionRate the commisionRate to set
     */
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Broker other = (Broker) obj;
        if (Double.doubleToLongBits(this.commissionRate) != Double.doubleToLongBits(other.commissionRate)) {
            return false;
        }
        if (!Objects.equals(this.licenseNum, other.licenseNum)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.deptNum, other.deptNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Broker{" + "licenseNum=" + licenseNum + ", firstName=" + firstName + ", lastName=" + lastName + ", deptNum=" + deptNum + ", commissionRate=" + commissionRate + '}';
    }
}
