import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int originalNumber;
        String binary;
        char again;

        do {
            binary = "";
            p("please enter a number you would like to convert to binary: ");
            while (!scan.hasNextInt()) {
                p("you must enter a number");
                scan.next();
            }
            number = scan.nextInt();
            originalNumber = number;
            do {
                binary = "" + (number % 2) + binary;
                number = number / 2;
            } while (number != 0);
            p("the binary for " + originalNumber + " is " + binary);

            p("Enter another number? (y/n): ");
            again = scan.next().toLowerCase().charAt(0);
        } while (again == 'y');
    }

    public static void p(String string) {
        System.out.println(string);
    }




}