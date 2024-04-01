import java.util.Scanner;
class CountString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter any String - ");
        s=sc.nextLine();
        int consts=0, vowel=0;
        if(s == "a" || s == "e" || s=="i" || s=="o" || s== "u" || s== "A"|| s=="E"|| s=="I"|| s=="O"||s== "U" )
        {
            vowel = vowel + 1;
        }
        else
        {
            consts = consts + 1;
        }
        System.out.println("Number os Vowels "+vowel);
        System.out.println("Number of Consonants " + consts);
    }
}