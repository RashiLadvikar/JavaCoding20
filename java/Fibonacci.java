import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String[] args) {
        int num, a = 0, b = 1, next;
        Scanner sc=new Scanner(System.in);
        System.out.print("Fibonacci series for the number - ");
        num=sc.nextInt();
        System.out.println(a+"  " +b+ "  ");
        for(int i=2; i<num; i++)
        {
            next = a+b;
            a=b;
            b=next;
            System.out.print(next+"  ");
        }
    }
}