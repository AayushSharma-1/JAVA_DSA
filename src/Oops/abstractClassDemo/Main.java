package Oops.abstractClassDemo;

public class Main {
    public static void main(String[] args) {
        SOn son = new SOn(28);
        son.career();
        Daughter daughter = new Daughter(30);
        daughter.career();
        Parent.hello();

    }
}
