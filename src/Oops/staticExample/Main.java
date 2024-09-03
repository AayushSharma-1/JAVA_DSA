package Oops.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Aayush = new Human(21, "Aayush", 10000,false);
//        Human tushar = new Human(45, "Tushar", 15000,true);
//
//        System.out.println(Aayush.population);
//        System.out.println(tushar.population);
//        greeting();
    }

    static void fun(){

//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instance
        // you cannot acces non static stuff without refrencing their instance in a static context

        // Hence, here's refrence
        Main obj  = new Main();
        obj.greeting();
    }

    //we know that something which is not static , belongs to an object
    void greeting(){
        System.out.println("hello");
    }
}
