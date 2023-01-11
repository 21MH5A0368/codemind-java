import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vc=0,min=999999,count=0;
        String s=sc.nextLine();
        sc.close();
        String v="AEIOUaeiou";
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(v.contains(words[i].charAt(j)+"")){
                    vc++;
                }
            }
            if(vc<min){
                min=vc;
            }
            vc=0;
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(v.contains(words[i].charAt(j)+"")){
                    vc++;
                }
            }
            if(vc==min){
                count++;;
            }
            vc=0;
        }
        System.out.print(count);
    }
}