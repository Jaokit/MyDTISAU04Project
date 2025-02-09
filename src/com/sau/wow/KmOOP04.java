package com.sau.wow;

public class KmOOP04 {
    //data
    public int a = 10;
    public static int b = 20; //ทุก object ใช้ค่าร่วมกัน
    public final int c = 30;
    public static final int d = 40;
    
    //method
    public void showA() {
        System.out.println(a);
    }

    public static void showB() {
        System.out.println(b);
    }
    
    public void met1(){
        a = 100;
        showA();
        b = 200;
        showB();
    }
    public static void met2(){
        //a = 111; -> Error
        b = 222;
        //showA(); ->Error
        showB();
    }
}
