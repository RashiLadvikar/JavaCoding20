import java.util.Scanner;
class CommonElements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array : ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array : ");
        for(int i = 0; i< n1; i++)
        {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array : ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array : ");
        for(int i = 0; i< n2; i++)
        {
            array2[i] = sc.nextInt();
        }
        System.out.println("Common elements between the two arrays are : ");
        for(int i=0;i<n1;i++)
        {
            for(int j=0; j<n2; j++)
            {
                if(array1[i] == array2[j])
                {
                    System.out.println(array1[i] +" ");
                    break;
                }
            }
        }
    }
}