import java.util.*;
class sample{
    public static boolean isiso(String s)
    {
        //s=s.toLowerCase();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        sc.close();
        if(isiso(s1))
            System.out.println("True");
        else
            System.out.println("False");
    }
}