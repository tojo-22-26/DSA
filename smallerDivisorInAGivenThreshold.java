import java.util.*;

public class smallerDivisorInAGivenThreshold {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the Threshold: ");
        int t=in.nextInt();
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            mx=Math.max(mx,arr[i]);
        }
        int d=0;
        int low=1, high=mx;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(checkLess(arr, mid, t)){
                d=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        System.out.println(d);
    }
    public static boolean checkLess(int arr[], int mid, int t)
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%mid == 0) sum += arr[i]/mid;
            else sum+=arr[i]/mid+1;
        }
        if(sum<=t) return true;
        else return false;
    }
}
