import java.util.Scanner;

public class ShiftCharacters {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (letters only): ");
        String inputStr = scanner.nextLine();

        if (!inputStr.matches("[a-zA-Z ]+")) {
            System.out.println("Please Input letters only (Digits or symbols are not allowed).");
            scanner.close();
            return;
        }

        System.out.print("Enter a number: ");
        int shift;
        try {
            shift = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please Input a valid number");
            scanner.close();
            return;
        }

        String shifted = shiftCharacters(inputStr, shift);
        System.out.println("Shifted String: " + shifted);
    }

    public static String shiftCharacters(String str, int shift) {
        int stringLength = str.length();

        // Normalize shift value
        int shiftAdjustment = shift % stringLength;

        if (shiftAdjustment == 0) {
            return str;
        }

        return str.substring(stringLength - shiftAdjustment) + str.substring(0, stringLength - shiftAdjustment);
    }
}
