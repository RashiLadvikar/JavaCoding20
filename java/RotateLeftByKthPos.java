class RotateArray
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k=2;
        rotateArray(arr , k);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    public static void rotateArray(int [] arr, int k)
    {
        for(int i = 0; i<k; i++)
        {
            int temp = arr[0];
            for(int j=0; j<arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
    }
}