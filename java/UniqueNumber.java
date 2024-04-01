class UniqueNumber
{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,4,3,7,8};
        for(int i=0; i<arr.length;i++)
        {
            int count = 0;
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println("Unique Number: " +arr[i]);
                break;
            }
        }
    }
}