package com.sau.wow;

public class KmOOP03 {

    public int a;
    public int b;
    public int c;

//Overloading method
    public void showData(String x) {
        System.out.println(x);
    }

    public void showData(String x, String y) {
        System.out.println(x + y);
    }
    
//Overloading contructor
    public KmOOP03() {
        System.out.println("Hello");
    }

    public KmOOP03(int b, int c) {
        this.b = b;
        this.c = c;
        System.out.println("Hi");
    }

    public KmOOP03(int a, int b, int c) {
        System.out.println("Hey");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
