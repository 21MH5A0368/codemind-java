import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,vs;
        int i,j,sma_c=0;
        s=sc.nextLine();
        vs="aeiou";
        for(i=0;i<vs.length();i++){
            
            for(j=0;j<s.length();j++){
                if(vs.charAt(i)==s.charAt(j)){
                    sma_c++;
                    break;
                }
            }
        }
        if(vs.length()==sma_c)
            System.out.println("True");
        else
            System.out.println("False");
    }
}