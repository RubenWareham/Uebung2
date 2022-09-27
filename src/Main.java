import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in); // cin auf wish
        int num = sc.nextInt();
        System.out.println("fak("+num+") is: "+fak(num));
    }
    static long fak(int n){
        long res = 1;
        while(n>1){
            res *=n--;
        }
        return res;
    }
}