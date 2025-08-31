
import java.util.Scanner;

public class isPalindrome {
    public boolean pal(int x)
    {
        if(x<0 || (x%10==0 && x!=0)) return false;
        int reversedHalf=0;
        while(x>reversedHalf)
        {
            reversedHalf=reversedHalf*10+x%10;
            x/=10;
        }
        return (x==reversedHalf || x==reversedHalf/10);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        do { 
            System.out.print("Enter the value: ");
        int n=in.nextInt();
        isPalindrome res=new isPalindrome();
        System.out.println("The Result is: "+res.pal(n));
        System.out.print("Want to continue? (Y/N): ");
        in.nextLine();
        s=in.nextLine();
        } while (s.equalsIgnoreCase("y"));
        
    }
}
