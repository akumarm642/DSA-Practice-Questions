import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
       char[] ch1 = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'}; 
       StringCompression sc = new StringCompression();
       System.out.println(sc.compress(ch1));
    }
    public int compress(char[] chars) {
        int n= chars.length,count=0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<n;i++){
            if(i==n-1||(!(chars[i]==chars[i+1]))){
                sb.append(chars[i]);
                // if(i==n-1&&(chars[i-1]==chars[i])){
                //     count++;
                //     count--;
                // }
                if(count>0){
                count++;
                sb.append(count);}
                count=0;
            }
           else{
                count++;
            }

        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
        return chars.length;
        
    }
}
