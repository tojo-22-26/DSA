
import java.util.Scanner;
public class searchInAUnsortedArray {
    public int index(int[] arr, int target)
    {
         int n=arr.length;
         for(int i=0;i<n;i++)
         {
            if(arr[i]==target)
            {
                return i;
            }
         }
         return -1;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s;
        do
        {
            System.out.print("Enter the length of the Array: ");
            int n=in.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            System.out.print("Enter the target value: ");
            int target=in.nextInt();
            searchInAUnsortedArray res= new searchInAUnsortedArray();
            System.out.println("The result is: "+res.index(arr, target));
            System.out.print("Want to continue? (Y/N): ");
            in.nextLine();
            s=in.nextLine();
        }
        while(s.equalsIgnoreCase("Y"));
        
    }
}
