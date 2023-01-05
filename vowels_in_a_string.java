import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,vs;
        int i,found=0;
        s=sc.nextLine();
        vs=sc.nextLine();
        sc.close();
        for(i=0;i<s.length();i++){
            if(vs.charAt(0)==s.charAt(i)){
                found=1;
                break;
            }
        }
        if(found==1)
            System.out.println("True
"+i);
        else
            System.out.println("False");
    }
}