import java.util.*;
public class firstAndLast {
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

        //checking whether the target exists.
        int low=0, high=n-1;
        boolean flag=false;
        int ans[]={-1,-1}; //true if target is found.
        while(low<=high)
        {
            int mid=low + (high-low)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>=target)
            {
                high=mid-1;

            }
            else if(arr[mid]<=target)
            {
                low=mid+1;
            }
            else{
                System.out.println("Target not found!!!");
                break;
            }
        }

        //checking lower bound
        low=0; high=n-1;
        int lb=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                lb=Math.min(lb,mid);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        ans[0]=lb;
        low=0; high=n-1;
        int ub=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
            {
                ub=Math.min(ub,mid);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        ans[1]=ub-1;
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
    }    
}
