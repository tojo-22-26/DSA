
import java.util.Scanner;

public class checkIfArrayisSortedOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        do{
            System.out.print("Enter the length of the string: ");
            int n=in.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            checkIfArrayisSortedOrNot res=new checkIfArrayisSortedOrNot();
            System.out.println("The result is: "+res.chechSort(arr));
            System.out.print("Want to Continue? (Y/N): ");
            in.nextLine();
            s=in.nextLine();
        }
        while(s.equalsIgnoreCase("y"));
    }
    public boolean chechSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1]) continue;
            else{
                return false;
            }
        }
        return true;
    }
}
