// code to reverse a number
import java.util.Scanner;
class First{
    public static void main(String[] args) {
        int num , reverse = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number here - ");
        num=sc.nextInt();
        while(num!=0)
        {
        int remainder = num % 10;
        reverse = reverse*10 + remainder;
        num = num/10;
        }
        System.out.println("The reversed number is - "+reverse);
    }
}
