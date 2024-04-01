class RotateArrayToLeft
{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("Original Array : ");
        for( int num : array )
        {
            System.out.println(num + " ");
        }
        int firstElement = array[0];
        for(int i = 0; i<array.length-1; i++)
        {
            array[i] = array[i+1];
        }
        array[array.length-1] = firstElement;
        System.out.println("Array after rotating left by 1 position : ");
        for(int num : array)
        {
            System.out.println(num + " ");
        }
    }
}