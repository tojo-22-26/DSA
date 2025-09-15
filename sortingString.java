
import java.util.Arrays;
import java.util.Scanner;



public class sortingString {
    public static void main(String[] args) {
        String s, inp;
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.print("Enter the string: ");
            inp=in.nextLine();
            sortingString res=new sortingString();
            res.sort(inp);
            System.out.print("Want to continue? (Y/N): ");
            s=in.nextLine();
        }while(s.equalsIgnoreCase("y"));
    }
    public void sort(String s)
    {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch)
        {
            System.out.print(ele);
        }
        System.out.println();
    }
}

//for stringbuilder, we need to convert sb into string then we need to convert it into charArray
//Char[] arr=sb.toString().toCharArray();
