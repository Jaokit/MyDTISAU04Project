package com.sau.wow;

public class Test02 {

    public static void main(String[] args) {
        // 1
        KmOOP02 ob1;
        ob1 = new KmOOP02(10, 20);

        // 2
        KmOOP02 ob2 = new KmOOP02(10, 50);

        // 3
        KmOOP02 ob3 = new KmOOP02(10, 20);
        
        //การใช้งาน Object/Instace คือการใช้งาน Data/Method
        //การใช้งาน Data คือ เอาค่ามาใช้ หรือ กำหนดค่าใหม่
        //การใช้งาน Method คือ สั่งให้เมธอดนั้นทำงาน
        
        System.out.println(ob1.a + ob2.a);
        ob1.a = 100;
        System.out.println(ob1.a + ob2.a);
        ob2.showB();
        ob1.showA();
    }
}
