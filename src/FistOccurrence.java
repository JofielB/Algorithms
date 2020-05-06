public class FistOccurrence {
    public static int strStr(String haystack, String needle) {
        int str = -1;
        int same = 0;
        char word[] = haystack.toCharArray();
        char cNeedle[] = needle.toCharArray();
        if(word.length>10000){
            return -1;
        }
        for (int i = 0; i <word.length ; i++) {
            char currentLetter = word[i];
            if((currentLetter+"").equals(cNeedle[0]+"")){
                str = i;
                same=1;
                for (int j = 1; j < cNeedle.length; j++) {
                    if(word.length>i+j){
                        if((cNeedle[j]+"").equals(word[i+j]+"")){
                            same++;
                        }else {
                            same = 0;
                            str = -1;
                        }
                    }
                }
                if(same == cNeedle.length){
                    return str;
                }
            }
        }
        if(same!=cNeedle.length){
            return -1;
        }

        return str;
    }
    public static void main(String... args){
        String a = "a";
        //System.out. println(strStr("mississippi","issip"));
        System.out. println(strStr("mississippi","sipp"));
        //System.out. println(strStr("hello","ll"));
        //System.out. println(strStr("aaa","aaaa"));

    }
}
