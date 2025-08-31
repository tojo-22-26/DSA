
import java.util.Scanner;

public class searchInA2DMatrix {
    public boolean isPresent(int[][] arr, int target)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        do
        {
            System.out.print("Enter the no. of rows of the 2D array: ");
            int n=in.nextInt();
            System.out.print("Enter the no. of columns of the 2D array: ");
            int m=in.nextInt();
            int[][] arr=new int[n][m];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=in.nextInt();
                }
            }
                System.out.print("Enter the target value: ");
                int target=in.nextInt();
                searchInA2DMatrix res=new searchInA2DMatrix();
                System.out.println("The Result is: "+res.isPresent(arr, target));
                System.out.println("Want to continue? (Y/N): ");
                in.nextLine();
                s=in.nextLine();
            }
            while(s.equalsIgnoreCase("Y"));
        

    }
}
