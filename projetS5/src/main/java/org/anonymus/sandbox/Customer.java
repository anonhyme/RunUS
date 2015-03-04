package org.anonymus.sandbox;

/**
 * Created by antoine on 11/28/2014.
 */
public class Customer {
    private Person2 person2;
    private int type;
    private String action;


    public Customer() {
        // TODO Auto-generated constructor stub
    }

    public Customer(Person2 person2) {
        this.person2 = person2;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Person2 getCustomer() {
        return person2;
    }
}
