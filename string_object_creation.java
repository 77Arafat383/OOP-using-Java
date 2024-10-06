import java.util.Scanner;


class arafat {
    private String str;

  
    public arafat(String str) {
        this.str = str;
    }

    
    public int getLength() {
        return str.length();
    }

    
    public void findCharacterDetails(char target) {
        int count = 0;
        System.out.print("Character '" + target + "' appears at positions: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
                System.out.print((i+1)+ " ");
            }
        }
        System.out.println(); 

        if (count > 0) {
            System.out.println("The character '" + target + "' appears " + count + " times.");
        } else {
            System.out.println("The character '" + target + "' is not present in the string.");
        }
    }
}


public class string_object_creation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        arafat stringOps = new arafat(userInput);

        
        System.out.println("Length of the string: " + stringOps.getLength());
        System.out.println("Enter the character that you want to search for: ");
        char target = scanner.next().charAt(0);
       
        stringOps.findCharacterDetails(target);
    }
}
