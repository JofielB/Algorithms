public class ReverseString2 {
    public static String reverseWords(String s) {
        int firstLetter = 0;
        String reverseString = "";

        StringBuilder stringBuilder;

        char[] charString = s.trim().toCharArray();

        for (int i = 0; i <charString.length; i++) {
            if((charString[i]+"").equals(" ") || i == charString.length-1){
                stringBuilder = new StringBuilder();
                for (int j = firstLetter; j <=i ; j++) {
                    stringBuilder.append(charString[j]);
                }
                String currentAdd = stringBuilder.reverse().toString();
                currentAdd = currentAdd.trim();
                if(!currentAdd.equals("") && i<charString.length-1){
                    reverseString += currentAdd + " ";
                }else if(i==charString.length-1){
                    reverseString += currentAdd;
                }
                firstLetter = i;
            }
        }

        return reverseString;
    }

    public static void main(String[] args) {
        String test1 = "Let's take LeetCode            contest";
        System.out.println(reverseWords(test1)); //It should print: "s'teL ekat edoCteeL tsetnoc"

        /*String t = "           ";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t.trim());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());*/

    }

}
