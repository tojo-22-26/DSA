
import java.util.Scanner;

public class reverseStringwithSpace {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder st = new StringBuilder(in.nextLine());
        int n = st.length();
        int i = 0, j = 0;
        while (j < n) {
            if (st.charAt(j)!=' ') {
                j++;
            } else {
                reverse(st, i, j - 1);
                i = j + 1;
                j = i;
            }
        }

        reverse(st, i, j - 1);
        System.out.println(st);
        in.close();
    }

    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;j--;
        }
        
    }
}
