import java.util.Arrays;
import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s,  a,  b;
        do
        {
            System.out.print("Enter first string: ");
            a=in.nextLine();
            System.out.print("Enter first string: ");
            b=in.nextLine();
            anagramString res=new anagramString();
            System.out.println("The Result is: "+res.ana(a,b));
            System.out.print("Want to continue? (Y/N): ");
            s=in.nextLine();
        }
        while(s.equalsIgnoreCase("Y"));
    }
    public boolean ana(String a, String b)
    {
        if(a.length()!=b.length()) return false;
        char[] ah=a.toCharArray();
        char[] bh=b.toCharArray();
        Arrays.sort(ah);
        Arrays.sort(bh);
        for(int i=0;i<a.length();i++)
        {
            if(ah[i]!=bh[i])
            {
                return false;
            }
        }
        return true;
    }
}
