class Hash
{
    static void moveHashInFront(char str[])
    {
        int i = str.length-1;
        for(int j = i; j>=0; j--)
        if(str[j] != '#')
        {
            char c = str[i];
            str[i] = str[j];
            str[j] = c;
            i--;
        }
    }
    public static void main(String[] args) {
        char str[] = "Hey there w##elcome # to programming".toCharArray();
        moveHashInFront(str);
        System.out.println(String.valueOf(str));
    }
}