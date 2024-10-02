public class exaples {
    public static void main(String[] args) {
        String s = "   the     sky      is     blue    ";
        exaples rv1 = new exaples();
        System.out.println(rv1.reverseWords11(s));
    }
    private String reverseWords11(String s){
        s=s.substring(5,10);
        System.out.println(s);
        return null;
        
    }
}
