import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int count=0,i;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch>=48 &&  ch<=57 ){
                count++;
            }
        }
        if(count>0)
            System.out.println("Contains "+count+" digit");
        else
            System.out.println("Doesn't contain digit");
    }
}