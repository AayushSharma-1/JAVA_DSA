package Oops;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student Aayush = new Student(25, "Aayush Sharma", 80.1f);
        Student Rahul = new Student();
//        Aayush.changeName("Anime Lover");


//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;
//            Aayush.greeting();
//
        System.out.println(Aayush.rno);
        System.out.println(Aayush.name);
        System.out.println(Aayush.marks);

        Student random = new Student();
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "Something";
        System.out.println(two.name);


    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student() {
        this (13, "Default Person", 100.0f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}