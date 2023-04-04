import java.util.Scanner;

public class function2 {
    public static void sumOddNumber(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all odd numbers is : "+ sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOddNumber(num);
    }
}
