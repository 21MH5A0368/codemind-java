import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,count=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}