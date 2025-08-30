
import java.util.Scanner;



public class medianOfTwoSortedArray {
    public double med(int[] arr1, int[] arr2)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int len=n1+n2;
        int[] arr=new int[len];
        int i=0,j=0,k=0;
        while(i < n1 && j < n2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k++]=arr1[i++];
            }
            else
            {
                arr[k++]=arr2[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=arr1[i++];
        }
        while(j<n2)
        {
            arr[k++]=arr2[j++];
        }
        if(len%2==0)
        {
            return (double)((arr[len/2]+arr[(len/2)-1])/2);
        }
        else
        {
            return (double)(arr[len/2]);
        }
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the first array: ");
        int n1=in.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the values of the first array:");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.print("Enter the length of the second array: ");
        int n2=in.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the values of the second array:");
        for(int j=0;j<n2;j++)
        {
            arr2[j]=in.nextInt();
        }
        medianOfTwoSortedArray res=new medianOfTwoSortedArray();
        System.out.println(res.med(arr1, arr2));
        in.close();
    }
}
