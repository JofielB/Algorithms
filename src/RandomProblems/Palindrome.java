package RandomProblems;

public class Palindrome {
    public boolean isPalindrome(int x) {
        StringBuilder number = new StringBuilder();
        number.append(("" +x));
        return (number.toString()).equals((number.reverse().toString()));
    }
}
