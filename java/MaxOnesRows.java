class MaxOnesRows
{
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,1,1},
            {0,0,0,1},
            {1,1,1,1},
            {0,0,0,1},
        };
        int MaxOnes = findMaxOnesRow(matrix);
        System.out.println("Rows with the maximum number of 1's is : " +MaxOnes);
    }
    public static int findMaxOnesRow(int[][] matrix)
    {
        int MaxOnes = -1;
        int MaxOnesCount = 0;
        for(int i = 0; i<matrix.length; i++)
        {
            int onesCount = 0;
            for(int j = 0; j<matrix[i].length; j++)
            {
                onesCount += matrix[i][j];
            }
            if(onesCount > MaxOnesCount){
                MaxOnesCount = onesCount;
                MaxOnes = i;
            }
        }
        return MaxOnes;
    }
}