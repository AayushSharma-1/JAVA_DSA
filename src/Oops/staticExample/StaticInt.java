package Oops.staticExample;
//
public class StaticInt {
    static int a = 4;
    static int b;
    // will only once, when the first obj is created.
    static {
        System.out.println("i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + StaticInt.b);

        StaticInt.b +=3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
