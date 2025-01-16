import java.util.Scanner;
public class Fibonacci {
    static int fibbo(int num) {
        if (num == 1 || num == 0)
            return num;
        else
            return fibbo(num - 1) + fibbo(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of terms in Fibonacci Series to be printed");
        int len = sc.nextInt();
       for(int i=0;i<len;i++)
           System.out.print(fibbo(i)+" ");
        }
}

