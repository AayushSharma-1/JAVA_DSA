public class leetCode1871 {
    public static boolean canReach(String s, int minJump, int maxJump) {
        char [] ch = s.toCharArray();
        boolean flag = false;
        int j = 0;
        for(int i = 0; i< ch.length; i++){
            if((i + minJump <= i) && (i <= Math.min(i+ maxJump, s.length() -1)) && ch[j] =='0'){
                j = i;
                if(j==(s.length()-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canReach("011010",2,3));
    }
}
