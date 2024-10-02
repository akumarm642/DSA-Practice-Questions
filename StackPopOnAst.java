import java.util.Stack;

public class StackPopOnAst {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        StackPopOnAst spa = new StackPopOnAst();
        System.out.println(spa.removeStars(str));
    }

    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
            }else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : st){
            sb.append(ch);
        }
        return sb.toString();

    }
}
