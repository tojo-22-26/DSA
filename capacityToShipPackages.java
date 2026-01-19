import java.util.*;
public class capacityToShipPackages {
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
        System.out.print("Enter the Days: ");
        int d=in.nextInt();
        int mx=Integer.MIN_VALUE, sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            mx=Math.max(mx, arr[i]);
        }
        int low=mx, high=sum;
        int minC=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(arr,mid, d)==true){
                high=mid-1;
                minC=mid;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Capacity Required: "+minC);
    }
    public static boolean isPossible(int arr[], int c, int days)
    {
        int n=arr.length;
        int load=0;
        int d=1;
        for(int i=0;i<n;i++)
        {
            if(load+arr[i]<=c) load+=arr[i];
            else{
                load=arr[i];
                d++;
            }
        }
        if(d>days) return false;
        else return true;
    }
}
