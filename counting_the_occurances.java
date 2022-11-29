import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char let=sc.next().charAt(0);
        sc.close();
        int i,c=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if( ch==let){
                c++;
            }
        }
        if(c>0){
            System.out.print(c);
        }
        else{
            System.out.print("-1");
        }
    }
}