import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = { 10, 2, 7, -5, -9, -11 };
        AsteroidCollision ac = new AsteroidCollision();
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids)));
    }

    public static Stack<Integer> DetectCoolision(Stack<Integer> s) {

        return s;
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int num : asteroids) {
            while (!(s.isEmpty()) && num<0 && s.peek()>0) {
                int dif = num + s.peek();
                if(dif < 0){
                    s.pop();
                }else if(dif == 0){
                    num=0;
                    s.pop();
                }else{
                    num=0;
                }
            }
            if (num != 0) {
                s.push(num);               
            }

        }
        return s.stream().mapToInt(Integer::intValue).toArray();

    }
}
