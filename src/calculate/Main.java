package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char answer;
        do {

            System.out.println("Enter first Number ");
            int a = sc.nextInt();
            System.out.println("Enter Second Number ");
            int b = sc.nextInt();
            System.out.println("Enter one of the symbol +,-,*,/");
            char c = sc.next().charAt(0);
            Calculator obj = new Calculator();

            obj.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculation Please 'y' or 'n'");
            answer = sc.next().charAt(0);

        } while (answer == 'y' || answer == 'Y');


    }


}
