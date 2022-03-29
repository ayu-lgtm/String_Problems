
class Result {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
        // Write your code here
        int j = 0;
        String st = "";

        for (j = 0; j < s.length(); j++) {
            if (s.charAt(j) >= 'A' && s.charAt(j) <= 'z') {
                break;
            }
        }

        System.out.print(j + " ");
        int i = j;
        int k = j - 1;

        while (i < s.length()) {

            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && (i < s.length() - 1)
                    && (s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z')) {

                st += s.charAt(i + 1);
                st += s.charAt(i);
                i = i + 3;

            } else if (s.charAt(i) == '0') {

                st += s.charAt(k);
                i++;
                k--;

            } else {
                st += s.charAt(i);
                i++;
            }

        }
        return st;

    }

}

public class Decrypt_password_hackerrank_basic_certificate_problem {
    public static void main(String[] args) {

        // String s = "pTo*Ta*O";
        String s = "51Pa*0Lp*0e";

        String result = Result.decryptPassword(s);

        System.out.print(result);
    }
}
