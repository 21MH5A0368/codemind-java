import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),vowels="AEIOUaeiou";
        sc.close();
        int i,c=0,v=0,d=0,s=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowels.contains(ch+""))
            {
                v++;
            }
            else if(ch==' '){
                s++;
            }
            else if(ch>=48 && ch<=57){
                d++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowels: "+v+"
Consonants: "+c+"
Digits: "+d+"
White spaces: "+s);
    }
}