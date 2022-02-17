package com.dhirunand.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *      Configuration Technique of lifecycle methods
 *       1. Xml
 *       2. Spring Interface
 *       3. Annotation
 */


//2. Spring Interface
/*    init()    :   InitializingBean  => afterPropertiesSet()
      destroy() :   DisposableBean    => destroy()

 */

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
    }

    public Pepsi(double price) {
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
        return "Pepsi{" +
                "price=" + price +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        //init method
        System.out.println("taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("going to put bottle back to shop: destroy");
    }
}
