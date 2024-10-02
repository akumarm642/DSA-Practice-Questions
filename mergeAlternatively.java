public class mergeAlternatively {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrshh";
        mergeAlternatively s1 = new mergeAlternatively();
        System.out.println( s1.mergeAlternately(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
       int w1=word1.length();
       int w2=word2.length();
       int gr=w1>=w2?w1:w2;
       StringBuilder sb = new StringBuilder("");
      
       for(int i=0;i<gr;i++){
            if(w1>0){
                sb.append(word1.charAt(i));
                w1--;
            }
            if(w2>0){
                sb.append(word2.charAt(i));
                w2--;  
            }
       } 
       String newStr = sb.toString();
       return newStr;
    }
}