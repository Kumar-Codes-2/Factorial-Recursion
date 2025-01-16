import java.util.Scanner;
public class CountingVowels {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
            count++;
        }
      sc.close();
        System.out.println("The number of Vowels in the Given String:: " + count);
    }
}
