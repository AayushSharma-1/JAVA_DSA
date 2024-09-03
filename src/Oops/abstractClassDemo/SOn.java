package Oops.abstractClassDemo;

public class SOn extends Parent{
    public SOn(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder" );
    }

    @Override
    void partner() {
        System.out.println("I love marvel" );
    }
}
