package RecursionArrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 4, 7, 8};
//        System.out.println(search(arr, 6, 0));
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);
//        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findALlIndex2(arr, 4, 0));
    }
    static int search(int []arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index + 1;
        }
        else{
            return search(arr, target, index + 1);
        }
    }
    //for multiple targets in Array

     static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] arr, int target , int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index+1);
        }
        return  findAllIndex(arr, target, index+1, list);

    }

    static ArrayList<Integer> findALlIndex2(int[] arr, int target , int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        //this will contain for that function call only
        if(arr[index] == target){
            list.add(index+1);
        }
        ArrayList<Integer> ansFromBelowCalls  = findALlIndex2(arr, target, index+1);
         list.addAll(ansFromBelowCalls);

         return list;
    }
}
