/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap9lab;

/**
 *
 * @author skirchoff2
 */
public class PreferredCustomer extends Customer {

    private int cusPurchases; 
    private double discLevel; 
    
 
    public PreferredCustomer(int cusPurchases, int customNum, boolean mailingListSub, String name, String address, String phone) {
        super(customNum, mailingListSub, name, address, phone);
        this.cusPurchases = cusPurchases;
    }

    
    public int getCusPurchases() {
        return cusPurchases;
    }

    public double DiscLevel() {
       
        if (cusPurchases > 500 && cusPurchases < 1000)
        {
            discLevel = 0.05;
        }
        
        if (cusPurchases > 1000 && cusPurchases < 1500)
        {
            discLevel = 0.06;
        }
        
        if (cusPurchases > 1500 && cusPurchases < 2000)
        {
            discLevel = 0.07;
        }

        if (cusPurchases > 2000)
        {
            discLevel = 0.10;
        }
        
        
        return discLevel;
    }

    public void setCusPurchases(int cusPurchases) {
        this.cusPurchases = cusPurchases;
    }

    public void setDiscLevel(double discLevel) {
        this.discLevel = discLevel;
    }
    
    
    
}
