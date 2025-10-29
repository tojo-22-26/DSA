
import java.util.Scanner;

public class bubbleSortTwo {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
