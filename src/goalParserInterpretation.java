public class goalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            str.append(command.charAt(i));

        }
        int len = command.length();
        for(int i = 0; i < len ; i++){
            if((str.charAt(i)=='(') && (str.charAt(i+1)=='a')){
                str.replace(i,i+4,"al");

                len-=2;
            }
            if((str.charAt(i)=='(') && (str.charAt(i+1)==')')){
                str.replace(i,i+2,"o");
                len --;
            }

        }
        return str.toString();
    }
}
