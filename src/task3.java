import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        //Task 1
//        double result=1;
//        Scanner read = new Scanner(System.in);
//        System.out.println("Enter the First number:");
//        double num1 = read.nextDouble();
//        System.out.println("Enter the Second number:");
//        double num2 = read.nextDouble();
//        while (num2 != 0) {
//            result = num1* result;
//            --num2;
//        }
//        System.out.println(result);

        //Task 2
        int k = 5;

          Scanner read = new Scanner(System.in);
          Random rnd = new Random();
          int computer = rnd.nextInt(10);
        System.out.println(computer);
        System.out.println("user: ");
        int user = read.nextInt();
         for (int i = 0; i<=k; i++) {
             if (computer > user) {
                 System.out.println("computer number is larger");
             } else if (computer < user) {
                 System.out.println("user number is larger");
             } else if (computer == user) {
                 System.out.println("Right Answer");
                 break;
             }
         }

    }
}
