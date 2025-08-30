
import java.util.Scanner;



public class powNegAndPos {
    public double pow(double x, int n)
    {
        long temp=n;
        double ans=1.0;
        if(temp<0)
        {
            x=1/x;
            temp=-temp;
        }
        while(temp>0)
        {
            if(temp%2==1)
            {
                ans*=x;
            }
            x*=x;
            temp/=2;
        }
        return ans;
    }
    public static void main(String args[])
    {
        String ch;
        Scanner in=new Scanner(System.in);
        do { 
            
            System.out.print("Enter the base value: ");
            double x=in.nextDouble();
            System.out.print("Enter the Power value: ");
            int n=in.nextInt();
            powNegAndPos res=new powNegAndPos();
            System.out.println("The Result is: "+res.pow(x,n));
            System.out.print("Want to continue? (Y/N)?: ");
            in.nextLine();
            ch=in.nextLine();
        } while (ch.equalsIgnoreCase("Y"));
        in.close();
    }
}
