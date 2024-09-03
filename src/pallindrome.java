public class pallindrome {
    public static void main(String[] args) {
        String str = "abcdcda" ;
        str = str.toLowerCase();


        int i = 0;
        int j = str.length() - 1;
        boolean f = true;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("Not a Pallindrome");
                f  = false;
                break;
            }
        }
        if (f){
            System.out.println("Its a Pallindrome");
        }
    }
}
