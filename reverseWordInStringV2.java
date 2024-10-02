public class reverseWordInStringV2 {
    public static void main(String[] args) {
        String s = "   the     sky      is     blue";
        reverseWordInStringV2 rv1 = new reverseWordInStringV2();
        System.out.println(rv1.reverseWords1(s));
    }
    private String reverseWords1(String s){
        s=s.trim();
        StringBuilder sb = new StringBuilder(" "+s);
        StringBuilder sb1 = new StringBuilder("");
        int p=sb.length();
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)!=' '&&(sb.charAt(i-1)==' ')){
                sb1.append(sb.substring(i, p).trim()+" ");
                p=i-2;
            }
        }
        s = new String(sb1);
        return s.trim();

    }
}
