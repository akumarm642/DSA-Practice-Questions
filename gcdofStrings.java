public class gcdofStrings {
    int x;
    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";
        gcdofStrings s1 = new gcdofStrings();
        System.out.println( s1.gcdOfStrings(word1,word2));
     

    }
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for(int i=n2;i>=1;i--){
            if(n2%i==0&&n1%i==0){
                x=i;
                break;
            }
        }
       
            for(int j1=1;j1 <= n2/x;j1++){
                sb2.append(str2.substring(0,x));
            }
           
            for(int j2=1;j2<=n1/x;j2++){
                sb1.append(str2.substring(0,x));
            }
           
        if(str1.equals(sb1.toString())&&str2.equals(sb2.toString())){
        return str2.substring(0, x);
            }
            else {
                return "";
            }
   
    }
    
}
