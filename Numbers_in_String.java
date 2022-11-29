import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=0,i,sum=0;
        String str=sc.nextLine(),vowels="aeiou";
        sc.close();
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=48 && ch<=57){
                sum+=ch-48;
            }
        }
            System.out.print(sum);
    }
}