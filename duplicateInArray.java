

import java.util.Arrays;
import java.util.Scanner;

public class duplicateInArray {
    public int removeDuplicates(int arr[])
    {
        Arrays.sort(arr);
        int n=arr.length;
        int count=1;
        if(n<3) return 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1] && count>=2 && arr[count-2]==arr[i])
            {
                continue;
            }
            arr[count]=arr[i];
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        do { 
            System.out.print("Enter the length of the array: ");
            int n=in.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            duplicateInArray res=new duplicateInArray();
            int val=res.removeDuplicates(arr);
            System.out.print("Duplicate value: "+val);
            System.out.println();
            for(int i=0;i<val;i++)
            {
                System.out.print(arr[i]+" ");            }
            System.out.print("\nWant to continue? (Y/N): ");
            in.nextLine();
            s=in.nextLine();
        } while (s.equalsIgnoreCase("Y"));
    }
}
