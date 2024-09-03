package Oops;

import java.sql.SQLOutput;

public class WrapperClasses {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 54;
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
       final A Aayush = new A("Aayush");
       Aayush.name = "Other Name";

       // when a non primitive is final, you cannont reassign it;
//       Aayush = new A("Other Object");
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}