import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
//        System.out.println("Enter Word: ");
//        Scanner read = new Scanner(System.in);
//        String word = read.next(), nstr = " ";
//
//        char refword;
//
//        for(int i =0; i<word.length();i++)
//        {
//               refword = word.charAt(i);
//               nstr = refword + nstr;
//        }
//
//        System.out.println("the reverse word is: " +nstr);

        String [] word;
        System.out.println("Enter sentence: ");
        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();
        word = sentence.split(" ");
        System.out.println("the reverse sentences is: ");
        for (int i = word.length - 1 ;i>= 0 ; i--){
            System.out.print(word[i] + " ");
        }



    }
}