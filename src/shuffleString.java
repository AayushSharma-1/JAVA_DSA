public class shuffleString {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",arr));
    }
    public static String restoreString(String s, int[] indices) {
        // Arrays.sort(indices);
        StringBuilder str = new StringBuilder();

        for(int i = 0; i< s.length() ; i++){
            str.append(s.charAt(indices[i]));
        }
        return str.toString();
    }
}
