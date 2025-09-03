
import java.util.Scanner;

public class countVowels {
    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        countVowels res=new countVowels();
        String s;
        
        do { 
            int count=0;
            System.out.print("Enter the string: ");
            String st=in.nextLine();
            int n=st.length();
            for(int i=0;i<n;i++)
            {
                char ch=st.charAt(i);
                if(res.isVowel(ch))
                {
                    count++;
                }
            }
            System.out.println("The number of vowels in the given String: "+count);
            System.out.println("Want to continue? (Y/N): ");
            s=in.nextLine();
        } while (s.equalsIgnoreCase("Y"));
        
    }
}
