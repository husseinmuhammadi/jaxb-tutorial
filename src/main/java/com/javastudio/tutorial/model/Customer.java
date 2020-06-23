package com.javastudio.tutorial.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//
//@XmlRootElement
//@XmlType(propOrder={"ID", "firstName", "lastName"})
public class Customer {
    private String firstName;
    private String lastName;
    private int ID;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public int getID() {
        return ID;
    }
}
