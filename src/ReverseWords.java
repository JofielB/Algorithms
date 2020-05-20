import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();
        int lastWord = charArray.length-1;
        List<String> list = new ArrayList<>();
        for (int i = lastWord; i >= 0 ; i--) {
            if((charArray[i]+"").equals(" ") || i == 0 ){
                int current = i;
                while(current<=lastWord){
                    if(!(charArray[current]+"").equals(" ")) {
                        stringBuilder.append(charArray[current]);
                    }
                    current++;
                }
                if(i != 0){
                    stringBuilder.append(" ");
                }
                lastWord = i;
            }
        }
        if(stringBuilder.length()>1) {
            while (stringBuilder.length()>0 && (stringBuilder.charAt(0) + "").equals(" ")) {
                stringBuilder.delete(0, 1);
            }
            while (stringBuilder.length()>0 && (stringBuilder.charAt(stringBuilder.length() - 1) + "").equals(" ")) {
                stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
            }
            for (int i = 0; i < stringBuilder.length() - 1; i++) {
                if ((stringBuilder.charAt(i) + "").equals(" ") && (stringBuilder.charAt(i + 1) + "").equals(" ")) {
                    stringBuilder.delete(i, i + 1);
                    i = 0;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String test1 = "          the sky          is blue          ";
        //System.out.println(reverseWords(test1)); // it should print: blue is sky the
        String test2 = "hello world!";
        //System.out.println(reverseWords(test2)); // it should print: world! hello
        String test3 = "    ";
        System.out.println(reverseWords(test3)); // it should print: ""
    }
}
