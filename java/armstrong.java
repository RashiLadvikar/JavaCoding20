import java.util.Scanner;
class ArmstrongNum
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if its Armstrong Number - ");
        int n=sc.nextInt();
        int temp=n;
        int r ,sum = 0;
        while(n>0)
        {
            r = n%10;
            n = n/10;
            sum = sum + r*r*r;
        }
        if(temp == sum)
        {
            System.out.println(" Its an Armstrong Number ");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}