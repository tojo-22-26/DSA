
    import java.util.Scanner;



    public class reverseSelectionSort extends selectionSort {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int n=in.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            reverseSelectionSort res=new reverseSelectionSort();
            res.revSelection(arr);
        }
        public void revSelection(int arr[])
        {
            int n=arr.length;
            for(int i=n-1;i>0;i--)
            {
                int max=Integer.MIN_VALUE;
                int idx=-1;
                for(int j=i;j>=0;j--)
                {
                    if(arr[j]>max)
                    {
                        max=arr[j];
                        idx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
            print(arr);
        }
    }
