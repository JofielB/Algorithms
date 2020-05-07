public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        String prefix = "";
        if(strs.length>0){
            int prefixNum = 1;
            for (int i = 0; i < strs[0].length() ; i++) {
                String currentPrefix = strs[0].substring(0,prefixNum);
                for (int j = 0; j <strs.length ; j++) {
                    if(prefixNum > strs[j].length()){
                        return prefix;
                    }
                    if(currentPrefix.equals(strs[j].substring(0,prefixNum))){
                        if(j==strs.length-1){
                            prefix = currentPrefix;
                        }
                    }else{
                        return prefix;
                    }
                }
                prefixNum++;
            }

        }
        return prefix;
    }

    public static void main(String... args){
        String[] test = {"flower","flow","flight"}; //Should return "fl"
        String[] test2 = {"dog","racecar","car"};  //Should return  ""
        String[] test3 = {"aa","a"};  //Should return  ""
        System.out.println(longestCommonPrefix(test3));
    }
}
