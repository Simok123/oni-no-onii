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
public class Customer extends Person {
    
    private int customNum;
    private boolean mailingListSub;

    public Customer(int customNum, boolean mailingListSub, String name, String address, String phone) {
        super(name, address, phone);
        this.customNum = customNum;
        this.mailingListSub = mailingListSub;
    }

    public int getCustomNum() {
        return customNum;
    }

    public boolean isMailingListSub() {
        return mailingListSub;
    }

    public void setCustomNum(int customNum) {
        this.customNum = customNum;
    }

    public void setMailingListSub(boolean mailingListSub) {
        this.mailingListSub = mailingListSub;
    }
    
    
    
}
