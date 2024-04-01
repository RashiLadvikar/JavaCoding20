import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its palindrome - "); 
        int num = sc.nextInt();
        int reverse = 0;
        int temp = num;

        while(temp != 0)
        {
            int remainder = temp%10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        if (num == reverse)
        {
            System.out.println(num+ " is a palindrome");
        }
        else{
            System.out.println(num+ " is not a palindrome");
        }
    }
}