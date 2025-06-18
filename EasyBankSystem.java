import java.util.Scanner;
public class EasyBankSystem {

            static int balance = 0; // Total money
            static Scanner input = new Scanner(System.in);

            public static void main(String[] args) {
                System.out.print("Set your 4-digit PIN: ");
                String savedPIN = input.nextLine();

                int tries = 0;
                while (tries < 3) {
                    System.out.print("Enter your PIN: ");
                    String pin = input.nextLine();

                    if (pin.equals(savedPIN)) {
                        startMenu(); // If correct PIN
                        return;
                    } else {
                        System.out.println("Wrong PIN.");
                        tries++;
                    }
                }

                System.out.println("Too many wrong attempts. Locked!");
            }

            // Menu Method
            public static void startMenu() {
                int choice = 0;

                while (choice != 4) {
                    System.out.println("\n--- Bank Menu ---");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Choose: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        deposit();
                    } else if (choice == 2) {
                        withdraw();
                    } else if (choice == 3) {
                        checkBalance();
                    } else if (choice == 4) {
                        System.out.println("Goodbye!");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
            }

            // Deposit Method
            public static void deposit() {
                System.out.print("Amount to deposit: ");
                int amount = input.nextInt();
                balance += amount;
                System.out.println("You deposited: $" + amount);
            }

            // Withdraw Method
            public static void withdraw() {
                System.out.print("Amount to withdraw: ");
                int amount = input.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("You withdrew: $" + amount);
                } else {
                    System.out.println("Not enough balance.");
                }
            }

            // Check Balance Method
            public static void checkBalance() {
                System.out.println("Your balance: $" + balance);
            }
        }

