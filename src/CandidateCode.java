/* Read input from STDIN. Print your output to STDOUT*/

import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr1 = new int[a+b];
        int [] arr2 = new int[a+b];

        for(int i = 0; i <a+b; i++ ){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        for(int i = 0; i < a+b; i++){
            if(arr1[i] == arr1[i+1]){
                arr2[i] = arr2[i+1] = i+1;

            }
            else{
                arr2[i] = 1+1;
            }
        }
        for(int i = a ;i < a+b; i++)
        {
            System.out.println(arr2[i]);
        }

        //Write code here

    }
}
