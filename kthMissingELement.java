import java.util.*;
public class kthMissingELement {
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
        System.out.print("Enter the Kth place value: ");
        int k=in.nextInt();
        kthMissingELement res=new kthMissingELement();
        System.out.println("The "+k+"th missing element is: "+res.missingNumber(arr, k));
    }
    public int missingNumber(int arr[], int k)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int missed=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            missed=arr[mid]-(mid+1);
            if(missed<k) low=mid+1;
            else high=mid-1;
        }
        return k+low;
    }
}
