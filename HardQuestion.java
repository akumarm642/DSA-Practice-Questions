public class HardQuestion {
    public static void main(String[] args) {
        String s = "ab", p = ".*";
        HardQuestion hd = new HardQuestion();
        System.out.println(hd.isMatch(s, p));
    }

    public boolean isMatch(String s, String p) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = p.toCharArray();
        
        for(int i=0;i<ch1.length;i++){
            if(ch1.length==ch2.length){
                if(ch1[i]!=ch2[i]){
                    if(ch2[i]=='*'){
                        
                        if(i==0){
                            ch2[i]='0';
                        }else{
                            ch2[i]=ch2[i-1];
                        }
                        // System.out.println(ch2[i]);
                    }else if(ch2[i]=='.'){
                        ch2[i]=ch1[i];
                        // System.out.println(ch2[i]);
                    }else{
                        return false;
                    }
                }else{continue;}
        }
        else{
            return false;
        }

    }
    String str1=new String (ch1);
    String str2=new String (ch2);
    System.out.println(str1);
    System.out.println(str2);

    if(str1.equals(str2))
    {
        return true;
    }
    return false;
}
}
