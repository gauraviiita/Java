import java.util.*;
public class function3 {

    public static int biggerNumber(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int big = biggerNumber(num1, num2);
        System.out.println("Bigger number is : "+ big);
    }
}
