import java.util.Scanner;
public class Sensial {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int sum = 0;

                System.out.println("Enter numbers to add.");
                System.out.println("Enter 'n' to stop.");
                System.out.println("If you enter text, it will print 5 times.");

                while (true) {
                    System.out.print("Enter: ");
                    String userInput = input.nextLine();

                    // Exit condition
                    if (userInput.equalsIgnoreCase("n")) {
                        System.out.println("You exited the program.");
                        break;
                    }

                    // If input is integer, add it to sum
                    if (isNumber(userInput)) {
                        int number = Integer.parseInt(userInput);
                        sum += number;
                        System.out.println("Current sum: " + sum);
                    } else {
                        // If it's not number, print 5 times
                        for (int i = 0; i < 5; i++) {
                            System.out.println(userInput);
                        }
                    }
                }

                System.out.println("Final sum is: " + sum);
            }

            // Method to check if input is integer number
            public static boolean isNumber(String str) {
                if (str == null || str.isEmpty()) return false;

                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i)) && !(i == 0 && (str.charAt(i) == '-' || str.charAt(i) == '+'))) {
                        return false;
                    }
                }

                return true;
            }
        }
