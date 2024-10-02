public class IsSequenceOfString {
    public static void main(String[] args) {
     String s = "acb", t = "axbycz";
     IsSequenceOfString is = new IsSequenceOfString();
     System.out.println(is.isSubsequence(s, t));   
    }
    public boolean isSubsequence(String s, String t) {
            for(char c :  s.toCharArray()){
                if((t.indexOf(c))>-1){                    
                    t=t.substring((t.indexOf(c))+1, t.length());
                }else{return false;}
            }
            return true;
    }
}
