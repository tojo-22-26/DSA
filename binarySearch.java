import java.util.*;
public class binarySearch {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Length of The array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target: ");
        int tar=in.nextInt();
        int lo=0, high=n-1;
        Arrays.sort(arr);
        while(lo<=high)
        {
            
            int mid= lo+(high-lo)/2;
            if(arr[mid]==tar)
            {
                System.out.print("Target found at"+mid);
                break;
            }
            else if(arr[mid]<tar)
            {
                lo=mid+1;
            }
            else if(arr[mid]>tar){
                high=mid-1;
            }
            else{
                System.out.print("Target not found!!!");
            }
        }
    }
}
