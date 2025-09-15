import java.util.Scanner;

public class isomorphicStrings {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s, t,u;
        do{
            System.out.print("Enter the first string: ");
            t=in.nextLine();
            System.out.print("Enter the second string: ");
            u=in.nextLine();
            isomorphicStrings r=new isomorphicStrings();
            System.out.println("The Result is: "+r.iso(t,u));
            System.out.print("Want to retry? (Y/N): ");
            s=in.nextLine();
        }
        while(s.equalsIgnoreCase("Y"));
        
    }
    public boolean iso(String a, String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }
        char[] arr=new char[128];
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            char dh=b.charAt(i);
            int idx=(int)ch;
            if(arr[idx]=='\0') arr[idx]=dh;
            else
            {
                if(arr[idx]!=dh) return false;
            }
        }
        for(int i=0;i<128;i++)
        {
            arr[i]='\0';
        }
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            char dh=a.charAt(i);
            int idx=(int)ch;
            if(arr[idx]=='\0') arr[idx]=dh;
            else
            {
                if(arr[idx]!=dh) return false;
            }
        }
        return true;
    }
}
