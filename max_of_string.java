import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        char max='a';
        String str=sc.nextLine();
        sc.close();
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>max)
            {
                max=ch;
            }
        }
        System.out.print(max);
    }
}