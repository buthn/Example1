import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        for(int i=1;i<=12;i++)
//        {
//            System.out.println("\t");
//            for(int j = 1;j<=12;j++)
//            {
//                System.out.print("\t"+i + " * " +j+ " = " + ( i*j ) );
//            }
//            System.out.println();
//        }

        Scanner read = new Scanner(System.in);
        System.out.println("Enter name:");
        String word = read.next();
        char[] n = word.toCharArray();

        System.out.println("The string is:" + word);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (n[i] == n[j]) {
                    System.out.print(n[j] + " ");
                    break;
                }
            }
        }

//        for (int i = 0 ;i<word.length();i++)
//        {
//            System.out.println(i);
//
//        }
    }
}