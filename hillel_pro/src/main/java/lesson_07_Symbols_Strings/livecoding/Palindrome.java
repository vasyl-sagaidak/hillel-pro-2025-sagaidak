package lesson_07_Symbols_Strings.livecoding;

public class Palindrome {
    public static void main(String[] args) {
        String[] palindromes = {
                "A man, a plan, a canal: Panama",
                null,
                "aa",
                " ",
                "abba",
                null,
                "",
                "race a car"
        };
        for (String s : palindromes) {
            System.out.println("[" + s + "], is " + isPalindrome(s));
        }
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.replaceAll("[^A-Za-z0-9]", "");
        int semiLen = s.length() / 2;
        if (s.isEmpty()) {
            return true;
        }
        String secondHalf = s.substring(semiLen);
        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 != 0) {
            sb.append(s, 0, semiLen + 1).reverse();
            return sb.toString().equalsIgnoreCase(secondHalf);
        } else {
            sb.append(s, 0, semiLen);
            return sb.toString().equalsIgnoreCase(secondHalf);
        }
    }

}
