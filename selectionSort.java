
import java.util.Scanner;
public class selectionSort {
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
        selectionSort res=new selectionSort();
        res.selection(arr);
    }
    public void selection(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int mindx=-1;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
    public void print(int arr[])
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
