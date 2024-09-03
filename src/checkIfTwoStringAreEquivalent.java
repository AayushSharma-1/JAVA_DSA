public class checkIfTwoStringAreEquivalent {
    public static void main(String[] args) {
        String[] s1 = {"a", "cb"};
        String[] s2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(int i = 0; i< word1.length; i++){
            w1.append(word1[i]);
        }
        for(int i = 0; i< word1.length; i++){
            w2.append(word2[i]);
        }
//        String s1 = "hello";
//        s1.to
        return(w1.toString().equals(w2.toString()));
    }
}
