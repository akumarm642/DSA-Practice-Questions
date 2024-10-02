import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TwoStringsAreClose {
    public static void main(String[] args) {
    String word1 = "cabbba";
    String word2 = "abbccc";
    TwoStringsAreClose tw = new TwoStringsAreClose();
    System.out.println(tw.closeStrings(word1, word2));
    }
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> w1 = new HashMap<>();
        HashMap<Character,Integer> w2 = new HashMap<>();
        for (char element : word1.toCharArray()) {
            if (w1.containsKey(element)) {
                w1.put(element, w1.get(element) + 1);
            } else {
                w1.put(element, 1);
            }
        }
        for (char element : word2.toCharArray()) {
            if (w2.containsKey(element)) {
                w2.put(element, w2.get(element) + 1);
            } else {
                w2.put(element, 1);
            }
        }
        List<Integer> v1 = new ArrayList<>(w1.values());
        Collections.sort(v1);
        List<Integer> v2 = new ArrayList<>(w2.values());
        Collections.sort(v2);
        if(v1.equals(v2) && w1.keySet().equals(w2.keySet())){
            return true;
        }
        return false;    
    }
}

