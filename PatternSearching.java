public class PatternSearching {
    public static void main(String args[]) {
        String s = "GEEKSFORGEEKS";
        String p = "EKS";

        // 1ST METHOD
        /*
         * int a = s.indexOf(p);
         * 
         * while (a>=0) {
         * System.out.print(a + " ");
         * a = s.indexOf(p, a+1);
         * }
         */

        // SECOND METHOD 0(m)
        /*
         * for (int i = 0; i <= s.length() - p.length();) {
         * int j = 0;
         * for (j = 0; j < p.length(); j++) {
         * if (s.charAt(i + j) != p.charAt(j)) {
         * break;
         * 
         * }
         * }
         * if (j == p.length()) {
         * System.out.print(i + " ");
         * }
         * if (j == 0) {
         * i++;
         * } else {
         * i = i + j;
         * }
         * }
         */

        search(p, s, 101);
        // Rabin karp algo 0(n-m+1)*m

    }
    // Following program is a Java implementation
    // of Rabin Karp Algorithm given in the CLRS book

    static final int d = 256;

    static void search(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

}
