import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class ReverseWhenSeeI {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Character> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String\n enter a number to exit");
        while(true){
            char ch=sc.next().charAt(0);
            if(Character.isDigit(ch)){
                break;
            }
            arr.add(ch);
            if(arr.get(arr.size()-1)=='i'||arr.get(arr.size()-1)=='I'){
                arr.removeLast();
                Collections.reverse(arr);
                for(Character ch1 : arr){
                    System.out.print(ch1);
                }System.out.println("\r");
            }
            else{
                for(Character ch1 : arr){
                    System.out.print(ch1);
                }System.out.println("\r");
            }
        }
        sc.close();
    }
}
