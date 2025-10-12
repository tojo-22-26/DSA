import java.util.Scanner;

public class stringCompression {
        public static void main(String args[])
        {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s;
        String ans="";
        s=in.nextLine();
        char[] arr=s.toCharArray();
        int i=0, j=0;
        while(j<arr.length)
        {
            if(arr[j]==arr[i]) j++;
            else{
                ans+=arr[i];
                int len=j-i;
                if(len>1) ans+=len;
                i=j;
            }
        }   
        ans+=arr[i];
        int len=j-i;
        if(len>1) ans+=len;
        System.out.println("The result is: "+ans);

    }
    }

