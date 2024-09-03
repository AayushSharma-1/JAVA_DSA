public class leetCode125 {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(((int)ch[i] >= 65 && (int)ch[i] <= 90) || ((int)ch[i] >= 97 && (int)ch[i] <= 122)){
                sb.append(Character.toLowerCase(ch[i]));
            } else if (((int)ch[i] >= 48 && (int)ch[i] <= 57)) {
                sb.append(ch[i]);

            } else{
                continue;
            }

        }
        System.out.println(sb);
        StringBuilder rev = new StringBuilder(sb.reverse());
        System.out.println(rev);
        if(rev == sb){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("raceacar");
        StringBuilder sb1 = new StringBuilder(sb.reverse());
        System.out.println(sb.toString().equals(sb1.toString()));
    }
}
