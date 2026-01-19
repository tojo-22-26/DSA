import java.util.*;
public class lowerBound {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.print("\nEnter the target: ");
        int tar=in.nextInt();
        int lb=n;
        int low=0;
        int high=n-1;
        Arrays.sort(arr);
        while(low<=high)
        {
            int mid = low + (high-low) / 2;
            if(arr[mid] >= tar){
                lb=Math.min(lb,mid);
                high = mid - 1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lb);
    }
}
