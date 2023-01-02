import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),vowels="AEIOUaeiou";
        sc.close();
        int i,v=0,found=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowels.contains(ch+""))
            {
                v++;
                found=1;
            }
        }
        if(found==1){
            System.out.println(v);
        }
        else{
            System.out.println("0");
        }
    }
}