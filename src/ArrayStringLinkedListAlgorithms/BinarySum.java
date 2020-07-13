public class BinarySum {
    public static String addBinary(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = Math.max(charA.length, charB.length);

        for (int i = 0; i <maxLength ; i++) {
            int currentA = charA.length-1-i < 0 ? 0:Integer.parseInt(charA[charA.length-1-i]+"");
            int currentB = charB.length-1-i < 0 ? 0:Integer.parseInt(charB[charB.length-1-i]+"");
            //TODO Manage a carry int to improve the algorithm
            int currentStringBuilder = stringBuilder.length()>0 ? Integer.parseInt(stringBuilder.charAt(0)+""):0;

            if(currentA + currentB + currentStringBuilder == 4){
                if(currentStringBuilder==2){
                    stringBuilder.replace(0,1,"1");
                }else {
                    stringBuilder.insert(0, "1");
                }
                stringBuilder.insert(0,"2");
            }else if(currentA + currentB + currentStringBuilder == 3){
                if(currentStringBuilder==2){
                    stringBuilder.replace(0,1, "0");
                }else {
                    stringBuilder.insert(0, "0");
                }
                stringBuilder.insert(0,"2");
            }else if(currentA + currentB + currentStringBuilder == 2){
                if(currentStringBuilder == 1){
                    stringBuilder.insert(0,currentB+currentA);
                }else {
                    if (currentStringBuilder == 2) {
                        stringBuilder.replace(0, 1, "1");
                    } else {
                        stringBuilder.insert(0, "0");
                        stringBuilder.insert(0, "2");
                    }
                }
            }else{
                stringBuilder.insert(0,currentB+currentA);
            }
        }
        if (Integer.parseInt(stringBuilder.charAt(0)+"") == 2){
            stringBuilder.replace(0,1, "1");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilder testTwo = new StringBuilder();
        testTwo.append("3");
        testTwo.append("2");
        testTwo.append("1");
        testTwo.append("0");
        testTwo.reverse();
        //System.out.println(testTwo);

        StringBuilder test = new StringBuilder();
        test.insert(0,"0");
        test.insert(0,"1");
        test.replace(0,1,"2");
        //System.out.println(test.toString());

        System.out.println(addBinary("110010","100"));
    }

}
