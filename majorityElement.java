
import java.util.Arrays;
import java.util.Scanner;

public class majorityElement {
    public int major(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        majorityElement res=new majorityElement();
        System.out.println("The result is: "+res.major(arr));
    }
}
