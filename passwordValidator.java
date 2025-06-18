import java.util.Scanner;
public class passwordValidator {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a password: ");
                String password = input.nextLine();

                if (isValidLength(password) &&
                        hasUpperCase(password) &&
                        hasLowerCase(password) &&
                        hasDigit(password) &&
                        hasSpecialChar(password)) {
                    System.out.println("✅ Strong password!");
                } else {
                    System.out.println("❌ Weak password. Try again.");
                }
            }

            // 1. Length check (>= 8)
            public static boolean isValidLength(String password) {
                return password.length() >= 8;
            }

            // 2. Has uppercase letter
            public static boolean hasUpperCase(String password) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        return true;
                    }
                }
                return false;
            }

            // 3. Has lowercase letter
            public static boolean hasLowerCase(String password) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isLowerCase(password.charAt(i))) {
                        return true;
                    }
                }
                return false;
            }

            // 4. Has digit
            public static boolean hasDigit(String password) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        return true;
                    }
                }
                return false;
            }

            // 5. Has special character
            public static boolean hasSpecialChar(String password) {
                String specialChars = "!@#$%^&*()-_=+[{]}|;:'\",<.>/?`~";
                for (int i = 0; i < password.length(); i++) {
                    if (specialChars.contains(Character.toString(password.charAt(i)))) {
                        return true;
                    }
                }
                return false;
            }
        }

