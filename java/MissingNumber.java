class MissingNumber
{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};
        int n=array.length+1;
        int sum=0;
        for(int i = 1; i<=n; i++)
        {
            sum += i;
            // int totalSum = n*(n+1)/2; --- for non consecutive numbers in array.
        }
        int arraySum = 0;
        for(int num: array)
        {
            arraySum += num;
        }
        int MissingNumber = sum - arraySum;
        System.out.println("The missing number in the array is: " +MissingNumber);
    }
}