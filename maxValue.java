
import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n=in.nextInt();
        in.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLine();
        }
        String maxS=arr[0];
        for(int i=0;i<n;i++)
        {
            maxS=max(maxS,arr[i]);
        }
        System.out.println("The Maximum value is: "+maxS);
    }
    public static String max(String a, String b)
    {
        String s=purify(a);
        String t=purify(b);
        if(s.length()>t.length()) return s;
        if(s.length()<t.length()) return t;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                if(s.charAt(i)>t.charAt(i)) return s;
                else{
                    return t;
                }
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String s)
    {
        //removing leading zeroes
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                return s.substring(i);
            }
        }
        return s;
    }
}
