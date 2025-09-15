import java.util.Scanner;

public class frequencyString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s, a;
        do
        {
            System.out.print("Enter the string: ");
            a=in.nextLine();
            int[] arr=new int[26];
            for(int i=0;i<a.length();i++)
            {
                char ch=a.charAt(i);
                int idx=(int)ch-97;
                arr[idx]++;
            }
            int max=-1;
            for(int i=0;i<a.length();i++)
            {
                max=Math.max(max,arr[i]);
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==max)
                {
                    char ch=(char)(i+97);
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
            System.out.print("Want to continue? (Y/N): ");
            s=in.nextLine();
        }while(s.equalsIgnoreCase("Y"));
    }    
}
