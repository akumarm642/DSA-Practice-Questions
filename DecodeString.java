import java.util.Stack;
import java.util.stream.Collectors;

public class DecodeString {
    public static void main(String[] args) {
        String st = "100[leetcode]";
        DecodeString dc = new DecodeString();
        System.out.println();
        System.out.println(dc.decodeString(st));
    }

    public String decodeString(String s) {
        Stack<String> stc = new Stack<>();
        Stack<Integer> stn = new Stack<>();
        StringBuffer s1 = new StringBuffer();
        for (int index=0;index<s.length();index++) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = count*10 + Character.getNumericValue(s.charAt(index));
                    index++;
                }
                index--;
                stn.push(count);
            } else {
                if (ch != ']') {
                    stc.push(Character.toString(ch));
                }else{
                    while(!(stc.peek().equals("["))){
                        s1.insert(0,stc.pop());
                    }
                    stc.pop();
                    stc.push(s1.toString().repeat(stn.pop()));
                    s1.setLength(0);
                }
            }
        }
        return stc.stream()
        .collect(Collectors.joining());
    }

}
