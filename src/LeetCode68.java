import java.util.ArrayList;
import java.util.List;

public class LeetCode68 {
    public static void main(String[] args) {

    }
    static public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length;
        int wordLen = 0;
        int extraSpace = 0;
        int space = 0;
        int remainder = 0;
        List<String> ans  = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int i = 0;
        while(i < len){

            if(temp.size() + wordLen + words[i].length() > maxWidth){
                extraSpace = maxWidth - wordLen;
                space = extraSpace / Math.max(1, temp.size() - 1);
                remainder = extraSpace % Math.max(1, temp.size() - 1);
                for (int j = 0; j < Math.max(1, temp.size()- 1); j++) {
                    temp.set(j, temp.get(j) + " ".repeat(space));
                    if(remainder!=0){
                        temp.set(j, temp.get(j) + " ");
                        remainder--;
                    }
                }
                ans.add(String.join("", temp));
                temp = new ArrayList<>();
                wordLen = 0;
            }
            temp.add(words[i]);
            wordLen += words[i].length();
            i++;

        }
        String last_line = String.join(" ", temp);
        int trailSpace = maxWidth - last_line.length();
        ans.add(last_line + " ".repeat(trailSpace));
        return ans;
    }
    static public List<String> fullJustify2(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0, n = words.length;

        while (i < n) {
            int lineLength = words[i].length();
            int j = i + 1;

            while (j < n && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();
            int spaceSlots = j - i - 1;

            if (j == n || spaceSlots == 0) {
                // Last line or a line with a single word
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int totalSpaces = maxWidth - lineLength;
                int spaces = totalSpaces / spaceSlots;
                int extraSpaces = totalSpaces % spaceSlots;

                for (int k = i; k < j - 1; k++) {
                    line.append(words[k]);
                    line.append(" ".repeat(spaces + (extraSpaces-- > 0 ? 1 : 0)));
                }
                line.append(words[j - 1]);
            }

            ans.add(line.toString());
            i = j;
        }

        return ans;
    }
}
