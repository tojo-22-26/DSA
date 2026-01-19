import java.util.*;
public class findKSmallestElements {
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
}
