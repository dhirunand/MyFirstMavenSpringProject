package com.dhirunand.autowiring.autowiredannotation;

import com.dhirunand.autowiring.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *  Autowiring
 *  1. xml          : no, byName, byType, constructor, autodetect(depreciated)
 *  2. Annotations  : @Autowired (property Autowired, constructor Autowired, setter Autowired
 */
public class Employee {

    @Autowired
    @Qualifier("address2")   //this is used if multiple object(bean) of Address class exists in config file
    private Address address;

//    @Autowired
    public Employee() {
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
