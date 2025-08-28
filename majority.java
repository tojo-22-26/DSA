import java.util.Scanner;

public class majority
{
    public int major(final int[] arr)
    {
        int count=0, candidate=0;
        for(int num:arr)
        {
            if(count==0)
            {
                candidate=num;
                count=1;
            }
            else if(num==candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Length of the array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        majority m =new majority();
        int res=m.major(arr);
        System.out.println("The Result is: "+res);
    }
}