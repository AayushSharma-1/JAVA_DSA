import java.util.ArrayList;
import java.util.List;

public class leetCode89 {
    public static void main(String[] args) {
        System.out.println(grayCode2(2));
    }

    static public List<Integer> grayCode2(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i = 1 ; i<Math.pow(2,n); i++){
            for(int j = i; j < Math.pow(2,n); j++){
                if(hammingDistance(arr.get(i-1), j) == 1){
                    arr.add(j);
                }
            }
        }
        return arr;


    }
   static public List<Integer> grayCode(int n) {
       ArrayList<Integer> arr = new ArrayList<>();
       int i = 0;
       arr.add(0);
       while(true){
           for (int j = 1; j < Math.pow(2,n); j++) {
               if(arr.contains(j)){
                   continue;
               }
               if(hammingDistance(arr.get(i),j) == 1){
                   arr.add(j);
                   i++;
               }

           } if(arr.size() == Math.pow(2,n)){
               return arr;
           }

       }


    }
    static public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
