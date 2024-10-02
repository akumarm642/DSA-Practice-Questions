import java.util.stream.IntStream;

public class maxNumOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;
        maxNumOfVowelsInASubstringOfGivenLength mav = new maxNumOfVowelsInASubstringOfGivenLength();
        System.out.println(mav.maxVowels(s, k));
    }

    private int maxVowels(String s, int k) {
        
        char[] ch1 = s.toCharArray();
        IntStream stream = IntStream.range(0, k)
                .map(i -> ch1[i]);
        long max;
        // Convert IntStream to Stream<Character>
        long total = stream.mapToObj(c -> (char) c)
                .filter(c -> isVowel(c))
                .count();
        max=total;
        for(int i=k;i<ch1.length;i++){
            total= (int)total-Vowel(ch1[i-k])+Vowel(ch1[i]);
            if(max<total){
                max = total;
            }
        }

        return (int)max;

    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;

    }
    public static int Vowel(char c) {
     if("AEIOUaeiou".indexOf(c) > -1)return 1; else return 0;
    }
}