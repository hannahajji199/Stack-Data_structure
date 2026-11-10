import java.util.Scanner;

public class Ex06_ReverseString_Main {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");
        String input = inputObject.nextLine();

        Reverser test = new Reverser();
        String result = test.reverse(input);
        System.out.println("Reversed String: " + result);
    }
}
