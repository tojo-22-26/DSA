

import java.util.Scanner;

public class Spiral {
    public void spiralPrint(int[][] arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        int minRow=0, minCol=0,maxRow=n-1,maxCol=m-1;
        //left to right
        for(int j=minCol;j<=maxCol;j++)
        {
            System.out.print(arr[minCol][j]+" ");
        }
        minRow++;
        //top to down
        for(int i=minRow;i<=maxRow;i++)
        {
            System.out.print(arr[i][maxCol]+" ");
        }
        maxCol--;
        //right to left
        for(int j=maxCol;j>=minCol;j--)
        {
            System.out.print(arr[maxRow][j]+" ");
        }
        maxRow--;
        //bottom to top
        for(int i=maxRow;i>=minRow;i--)
        {
            System.out.print(arr[i][minCol]+" ");
        }
        minRow--;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of Rows: ");
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
        Spiral ob=new Spiral();
        ob.spiralPrint(arr);
    }
}
