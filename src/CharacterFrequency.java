import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public String getFrequency(String s){
        int countA = 0,countE = 0,countI = 0,countO = 0,countU = 0;
        for(int i = 0;i<s.length();i++)
        {
            countA += s.charAt(i)=='a' || s.charAt(i)=='A'?1:0;
            countE += s.charAt(i)=='e' || s.charAt(i)=='E'?1:0;
            countI += s.charAt(i)=='i' || s.charAt(i)=='I'?1:0;
            countO += s.charAt(i)=='o' || s.charAt(i)=='O'?1:0;
            countU += s.charAt(i)=='u' || s.charAt(i)=='U'?1:0;
        }
        return "Frequency Of A: "+countA+
                "\nFrequency Of A : "+countE+
                "\nFrequency Of I: "+countI+
                "\nFrequency Of O: "+countO+
                "\nFrequency Of U: "+countU;
    }
}
class Testing2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterFrequency characterFrequency = new CharacterFrequency();
        System.out.println(characterFrequency.getFrequency(scanner.nextLine()));
    }
}
