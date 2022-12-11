import java.util.Scanner;
import java.util.Arrays;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),s2=sc.nextLine(),s;
        sc.close();
        char ch[]=(s1+s2).toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}