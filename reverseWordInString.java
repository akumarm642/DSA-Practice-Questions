import java.util.ArrayList;
public class reverseWordInString {
    public static void main(String[] args) {
        String s = "      The           sky             is              Blue     ";
        reverseWordInString rw = new reverseWordInString();
        System.out.println(rw.reverseWords(s));
    }
    private String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder(" ");
        char[] ch1 = s.toCharArray();
        ArrayList<Character> s1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("");
        for (char c  : ch1){
            s1.add(c);
        }
        outerloop: for(int i=0;i<s1.size();i++){
            if(s1.get(i)==' '){
                for(int j=i+1;j<s1.size();j++){
                if(s1.get(j)==' '){
                    s1.remove(j);
                    j--;
                }else{
                    continue outerloop;
                }
            }
            }
        }
        for(char c : s1){
            sb.append(c);
        }
        // System.out.println(sb);
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)==' '){
                sb1.append((sb.substring(i+1,sb.length()))+" ");
                // System.out.println(sb1);
                sb.delete(i, sb.length());
                // System.out.println(sb);
                i=sb.length()-1;
            }
        }
        String s11 = sb1.toString();
        return s11;
        
    }
}
