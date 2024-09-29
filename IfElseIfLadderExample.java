import java.util.Scanner;
//change.
public class IfElseIfLadderExample {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number > 0 && number <= 10) {
            System.out.println("The number is between 1 and 10.");
        } else if (number > 10 && number <= 50) {
            System.out.println("The number is between 11 and 50.");
        } else if (number > 50 && number <= 100) {
            System.out.println("The number is between 51 and 100.");
        } else {
            System.out.println("The number is greater than 100.");
        }

      
        scanner.close();
    }
}