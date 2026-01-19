import java.util.Scanner;
public class basicSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len= in.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int x=0;
        for(int i=0;i<len;i++)
            {
                int min=Integer.MAX_VALUE;
                int min_Index=-1;
                for(int j=0;j<len;j++)
                    {
                        if(arr[j]<min && arr[j]>0)
                            {
                                min=arr[j];
                                min_Index= j;
                            }
                        }
                        arr[min_Index] = x;
                        x--;
                    }
                    for(int ele:arr)
                        {
                            System.out.print(ele+" ");
                        }
                        System.out.println();
                        for(int i=0;i<len;i++)
                            {
                                arr[i]*=-1;
                            }
                            for(int ele:arr)
                                {
                                    System.out.print(ele+" ");
                                }
                                System.out.println();
        

    }
}
