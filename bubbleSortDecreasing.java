
import java.util.Scanner;

public class bubbleSortDecreasing
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        bubbleSortDecreasing res=new bubbleSortDecreasing();
        res.bubble(arr);

    }
    public void bubble(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}