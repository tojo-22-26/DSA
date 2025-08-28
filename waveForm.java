
import java.util.Scanner;

public class waveForm {
    public void wave(int[][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public void printArr(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < m; j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n=in.nextInt();
        System.out.print("Enter the no. of Columns: ");
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
        waveForm ob=new waveForm();
        ob.printArr(arr);
        ob.wave(arr);


    }
}
