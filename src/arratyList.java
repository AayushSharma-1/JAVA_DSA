import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arratyList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.set(0, 99);
        System.out.println(list);

        ArrayList<ArrayList<Integer>> list1 = new  ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                list1.get(i).add(in.nextInt());
            }
        }
        System.out.println(list1);
    }
}