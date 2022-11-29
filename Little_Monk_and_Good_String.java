import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=0,c=0,i;
        String str=sc.nextLine(),vowels="aeiou";
        sc.close();
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowels.contains(ch+"")){
                c++;
                if(max<c)
                {
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
            System.out.print(max);
    }
}