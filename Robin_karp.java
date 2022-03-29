public class Robin_karp {
    public static void main(String args[]) {
        String s1 = "aaabcdebcd";
        String s2 = "bcd";

        int h = 1, d = 256, q = 101;

        for (int i = 0; i < s2.length() - 1; i++) {
            h = (h * d) % q;
        }

        int p = 0, t = 0;
        for (int i = 0; i < s2.length(); i++) {
            p = (p * d + s2.charAt(i)) % q;
            t = (t * d + s1.charAt(i)) % q;
        }

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (p == t) {
                int j=0;
                for (j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        break;
                    }
                }
                if (j == s2.length()) {
                    System.out.print(i + " ");
                }
            }
            if (i < s1.length() - s2.length()) {
                t = (d * (t - s1.charAt(i) * h) + s1.charAt(i + s2.length())) % q;
                if (t < 0) {
                    t = t + q;
                }
            }
        }

    }
}
