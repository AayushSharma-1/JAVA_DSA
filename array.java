import java.util.*
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int tlen = 0;
        for (int i=0;i<size();i++){
            array[i] = sc.next();
            tlen+=array[i].length();
        }
        system.out.println(tlen);
    }
}
