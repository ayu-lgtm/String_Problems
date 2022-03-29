import java.util.Arrays;

public class Check_for_anagram {
    public static void main(String args[]) {
        String s1 = new String("listen");
        String s2 = new String("silent");

        char[] ch1 = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // System.out.print(Arrays.toString(ch1)+" "+Arrays.toString(ch2));
        if (Arrays.compare(ch1, ch2) == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}
