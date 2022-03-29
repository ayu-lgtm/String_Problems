import java.util.Arrays;

public class LeftMost_Non_Repeating_Element {
    public static void main(String args[]) {
        String s = "geeksforgeeks";
        int b[] = new int[256];
        Arrays.fill(b, -1);
        for (int i = 0; i < s.length(); i++) {
            if (b[s.charAt(i)] == -1) {
                b[s.charAt(i)] = i;
            } else {
                b[s.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int x : b) {
            if (x >= 0) {
                res = Math.min(res, x);
            }
        }
        System.out.print(s.charAt(res));
    }
}
