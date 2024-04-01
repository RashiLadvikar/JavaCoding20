class RemoveChar
{
    public static void main(String[] args) {
        String input = "H1eyy5 th45ere!";
        StringBuilder result=new StringBuilder();
        for(char c: input.toCharArray())
        {
            if((c>= 'a' && c<='z') || (c>='A' && c<='Z'))
            {
                result.append(c);
            }
        }
        System.out.println("Original String: " +input);
        System.out.println("Strng with only alphabets: "+result.toString());
    }
}