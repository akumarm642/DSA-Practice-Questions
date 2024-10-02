import java.util.ArrayList;

public class FindMaxArea {


    public static void main(String[] args) {
        int[] height = {1,1};
        FindMaxArea fma = new FindMaxArea();
        System.out.println(fma.maxArea(height));
    }
    public int maxArea(int[] height) {
        int max=0,n=height.length,m;
        ArrayList<Integer> h1 = new ArrayList<Integer>();
        h1.add(0);
        for(int i=0;i<n;i++){
            h1.add(height[i]);
        }
        for(int i=1;i<h1.size();i++){
            for(int j=i+1;j<h1.size();j++){
                m=h1.get(i)<h1.get(j)?h1.get(i):h1.get(j);
                if(m*(j-i)>max){
                    max=m*(j-i);
                }
            }
        }
        return max;
        
    }

}
