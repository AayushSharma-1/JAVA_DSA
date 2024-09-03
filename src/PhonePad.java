import java.sql.SQLOutput;
import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad2("", "9"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }

    }


    static ArrayList<String> pad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        ArrayList<String> list = new ArrayList<>();
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad2(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1 ; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad2(p + ch, up.substring(1)));
            }

        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad2(p + ch, up.substring(1)));
            }

        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad2(p + ch, up.substring(1)));
            }
        }
        return list;
    }
}

