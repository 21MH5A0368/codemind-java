import java.util.Scanner;
class eg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int units;
        float bill=0.0f;
        String id,name;
        id=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        if(units<200)
            bill=units*1.2f;
        else if(units<400)
            bill=units*1.5f;
        else if(units<600)
            bill=units*1.8f;
        else
            {
                bill=units*2.0f;
            }
        if(bill>400)
            bill=bill+0.15f*bill;
        else
            bill=bill+100;
        System.out.format("%.2f",bill);
        sc.close();
    }
}