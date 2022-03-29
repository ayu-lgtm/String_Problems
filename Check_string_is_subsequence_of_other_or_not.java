public class Check_string_is_subsequence_of_other_or_not {
    public static boolean function(String s1, String s2, int m, int n) {
        if (n == 0) {
            return true;
        }
        if (m == 0) {
            return false;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return function(s1, s2, m - 1, n - 1);
        } else {
            return function(s1, s2, m - 1, n);
        }
    }

    public static void main(String args[]) {
        String s1 = "ABCD";
        String s2 = "AD";

        // int j=0;//assume that s1 is greater than s2 in length
        /*
         * for(int i=0;i<s1.length();i++){
         * if(s1.charAt(i)==s2.charAt(j)){
         * j++;
         * }
         * }
         * if(j==s2.length()){
         * System.out.print("Yes");
         * }else{
         * System.out.print("No");
         * }
         */

        System.out.print(function(s1, s2, s1.length(), s2.length()));
    }
}
