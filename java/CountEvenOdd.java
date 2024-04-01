import java.util.Scanner;
class count
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements the array : ");
        for(int i = 0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int num : array)
        {
            if(num % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Number of even integers : " +evenCount);
        System.out.println("Number of odd integers : " +oddCount);

    }
}