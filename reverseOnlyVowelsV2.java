import java.util.HashSet;

public class reverseOnlyVowelsV2 {
    public static void main(String[] args) {
        String s = "LEET CODE";
        reverseOnlyVowelsV2 rv1 = new reverseOnlyVowelsV2();
        System.out.println(rv1.reverseVowels1(s));
    }

    public String reverseVowels1(String s) {
        char[] ch1 = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int i = 0, j = ch1.length - 1;
        while (i < j) {
            while (i < j && !vowels.contains(ch1[i])) {
                i++;
            }
            while (i < j && !vowels.contains(ch1[j])) {
                j--;
            }
            if (i < j) {
                char temp = ch1[i];
                ch1[i] = ch1[j];
                ch1[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(ch1);
    }
}
