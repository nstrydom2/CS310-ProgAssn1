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
public class Broker {
    private String licenseNum;
    private String firstName;
    private String lastName;
    private String deptNum;
    private double commisionRate;
    
    public Broker() {}

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
     * @return the commisionRate
     */
    public double getCommisionRate() {
        return commisionRate;
    }

    /**
     * @param commisionRate the commisionRate to set
     */
    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }
    
    
}