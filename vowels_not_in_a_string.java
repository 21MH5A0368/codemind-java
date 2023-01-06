import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int found=0;
        String v="aeiou";
        for(int i=0;i<v.length();i++){
            for(int j=0;j<s.length();j++){
                if(v.charAt(i)==s.charAt(j)){
                    break;
                }
                if(j==s.length()-1){
                    System.out.print(v.charAt(i)+" ");
                    found=1;
                }
            }
        }
        if(found==0)
            System.out.println("0");
    }
}