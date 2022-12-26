import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int i,c=0,max=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                c++;
            }
            if( ch==' ' || i==str.length()-1){
                if(c>max){
                max=c;
                }
                c=0;
            }
        }
        System.out.println(max);
    }
}