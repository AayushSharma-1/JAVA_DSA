package Oops.singleton;

public class Singleton {
   private Singleton() {

    }
    private static Singleton instance;

   public static Singleton getInstance(){
       // checl whether 1 obj only is created ir not
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
   }
}
