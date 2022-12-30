import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int i,c=0;
        for(i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}