import java.util.*;
public class mountainPeak {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        mountainPeak res=new mountainPeak();
        System.out.println("The result is: "+res.peakVal(arr));
    }   
    public int peakVal(int arr[])
    {
        int n=arr.length;
        int low=1, high=n-2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return arr[mid];
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) high=mid-1;
        }
        return 0;
    } 
}
