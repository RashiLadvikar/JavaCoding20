import java.util.Scanner;
class PangramCheck
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        boolean isPangram = checkPangram(input);
        if(isPangram){
            System.out.println("The string is a pangram ");
        }
        else{
            System.out.println("The string is not a pangram ");
        }
        sc.close();
    }
    public static boolean checkPangram(String str)
    {
        str = str.toLowerCase();
        boolean[] mark = new boolean[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>= 'a' && ch<= 'z'){
                int index = ch - 'a';
                mark[index] = true;
            }
        }
        for (boolean marked : mark){
            if(!marked){
                return false;
            }
        }
        return true;
    }
}