import java.util.*;

class _CodingChallenge1_Week3
{
    
    public static void main(String[] args)
    {
        ArrayList<String> words= new ArrayList<String>(Arrays.asList("karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer", "billy", "did"));
        ArrayList<String> palindrome= new ArrayList<String>();

        for(int i = 0; i < words.size(); i++)
        {
            if(palindromeChecker(words.get(i)) == true)
            {
                palindrome.add(words.get(i));
                System.out.println(words.get(i));
            }
        }
    }

    public static boolean palindromeChecker(String orig)
    {
        String rev = "";
        int len= orig.length();

        for(int i = len-1; i >=0; i--)
            rev = rev + orig.charAt(i);

        if(orig.equals(rev))
            return true;
        else
            return false;
    }
}