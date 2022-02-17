package com.dhirunand.constructorinjection;

public class Addition {
    private int a;
    private int b;



//    (int, int) constructor
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor : int, int");
    }



//    (double, double) constructor
    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor : double, double");
    }



//    (String, String) constructor
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor : String, String");
    }



    public void doSum() {
        System.out.println("Sum is = " + (a + b));
    }
}
