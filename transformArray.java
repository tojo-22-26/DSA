

import java.util.Scanner;

public class transformArray {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        transformArray res = new transformArray();
        res.transform(arr);
    }
    public void transform(int arr[])
    {
        int n=arr.length;
        int x=0;
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<min && arr[j]>0)
                {
                    min=arr[j];
                    mindx=j;
                }
            }
            arr[mindx]=x;
            x--;
        }
        for(int ele:arr)
        {
            ele*=-1;
            System.out.print(ele+" ");
        }
    }
}
