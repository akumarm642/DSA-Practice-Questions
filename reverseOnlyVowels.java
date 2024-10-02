public class reverseOnlyVowels {
    public static void main(String[] args) {
        String s = "LEET CODE";
        reverseOnlyVowels rv =new reverseOnlyVowels();
        System.out.println(rv.reverseVowels(s));

    }
    public String reverseVowels(String s) {
        char[] ch1 = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(char c : ch1){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                sb.append(c);
            }
        }
        sb.reverse();
        String str = new String(sb);
        char[] ch2 = str.toCharArray();
        for(int i=0,j=0;i<ch1.length&&j<ch2.length;i++){
            if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u'||ch1[i]=='A'||ch1[i]=='E'||ch1[i]=='I'||ch1[i]=='O'||ch1[i]=='U'){
                ch1[i]=ch2[j];
                j++;
        }
    }
        String s1 = new String(ch1);
        return s1;
        
}}