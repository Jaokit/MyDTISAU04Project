package com.sau.wow;

public class KmOOP01 {

    //data(field, attribute, property) member คุณสมบัติ หรือ คุณลักษณ์
    public int a;
    public double b = 10;
    public String c;

    //method member พฤติกรรม หรือการทำงานใดๆ
    public void showHello() {
        System.out.println("Hellooo");
    }

    public void calSUMAandBandC() {
        System.out.println(a + b + c);
    }

    //public KMOOP01(){} Empty Constructor
    //constructor
    public KmOOP01(int a, String c) {
        this.a = a;
        this.c = c;
    }
}
