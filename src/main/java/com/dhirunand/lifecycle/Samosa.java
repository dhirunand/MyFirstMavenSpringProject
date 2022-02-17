package com.dhirunand.lifecycle;

/**
 *  Configuration Technique of lifecycle methods
 *   1. Xml
 *   2. Spring Interface
 *   3. Annotation
 */


public class Samosa {
    private double price;

    public Samosa() {
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

//    This gets called after property setting i.e after price gets value from bean
    public void init() {
        System.out.println("Inside init method");
    }

    public void destroy() {
        System.out.println("Inside destroy method: bye bye i'm going to die");
    }
}
