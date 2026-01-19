import java.util.*;
public class searchInARotatedSortedArray {
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
        System.out.print("Enter the target: ");
        int target=in.nextInt();
        searchInARotatedSortedArray res=new searchInARotatedSortedArray();
        System.out.println(res.checkPresence(arr, target));

    }
    public boolean checkPresence(int arr[], int target)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low + (high-low)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]<=arr[high])//it is the right side of the half rotated array!!
            {
                if(target>arr[mid] && target<=arr[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            else
            {
                if(target>=arr[low] && target<=arr[mid])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return false;
    }
}
