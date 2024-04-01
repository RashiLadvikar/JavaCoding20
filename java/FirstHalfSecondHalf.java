class Sorting
{
    public static void main(String[] args) {
        int[] arr = {3,4,7,8,6,9,0,3,2,1};
        int n = arr.length;
        int mid = n/2;
        for(int i = 0; i<mid; i++)
        for(int j = i+1; j < mid; j++)
        {
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int i = mid; i<n; i++)
    {
        for(int j = i+1; j<n; j++)
        {
            if(arr[i] < arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int num:arr)
    {
        System.out.println(num + " ");
    }
    }
    
    
}