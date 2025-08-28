
import java.util.Scanner;

public class longestPalindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder st=new StringBuilder(in.nextLine());
        longestPalindrome pal=new longestPalindrome();
        System.out.println(pal.palindrome(st));
    }
    public String palindrome(StringBuilder s){
        if(s==null || s.length()==0) return "";
        int n=s.length();
        int start=0, maxLen=1;
        for(int i=0;i<n;i++)
        {
            int left=i, right=i;
            while(left>=0 && right <n && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            int len1=right-left-1;
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            int len2=right-left-1;
            int len=Math.max(len1, len2);
            if(len>maxLen)
            {
                maxLen=len;
                start=i-(len-1)/2;
            
            }
        }
        return s.substring(start, start+maxLen);
    }
}
