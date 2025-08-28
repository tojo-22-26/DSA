
import java.util.Scanner;


public class palindromeString {
    public boolean rev(String s)
    {
        StringBuilder p=new StringBuilder(s);
        String qp=p.reverse().toString();
        return qp.equals(s);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=in.nextLine();
        palindromeString res=new palindromeString();
        System.out.println(res.rev(s));
    }
}
