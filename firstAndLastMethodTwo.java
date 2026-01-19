import java.util.*;
public class firstAndLastMethodTwo {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target Value: ");
        int target=in.nextInt();
        firstAndLastMethodTwo res = new firstAndLastMethodTwo();
        res.check(arr, target);
    }

        public void check(int arr[],int target)
        {
            int n=arr.length;
            int ans[]={-1,-1};
            //checking for first position
            int low=0, high=n-1;
            int lb=0;
            while(low<=high)
            {
                int mid= low + (high - low)/2;
                if(arr[mid]==target){
                    if(arr[mid]==arr[mid-1]){
                        high=mid-1;
                    }
                    else{
                        lb=mid;
                        break;
                    }
                }
                else if(arr[mid]>target) high=mid-1;
                else if(arr[mid]<target) low=mid+1;
            }
            ans[0]=lb;

            //checking for last position
            low=0; high=n-1;
            int ub=n;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(arr[mid]==target)
                {
                    if(arr[mid]==arr[mid+1]){
                        low=mid+1;
                    }
                    else{
                        ub=mid;
                        break;
                    }
                }
                else if(arr[mid]>target) high=mid-1;
                else if(arr[mid]<target) low=mid+1;
            }
            ans[1]=ub;
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }        
    }
        //first checking lower bound
        
}
