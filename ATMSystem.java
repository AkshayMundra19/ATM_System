import java.util.Scanner;
import java.util.ArrayList;

class ATMSystem {

    static double balance = 10000;
    static int pin = 1234;
    static ArrayList<String> miniStatement = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VoiceAssistant.speak("Welcome to ATM");
        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter your ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            VoiceAssistant.speak("Wrong PIN. Access denied");
            System.out.println("Wrong PIN! Access Denied.");
            return;
        }

        VoiceAssistant.speak("Login successful");
        System.out.println("Login Successful!");

        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Fast Cash");
            System.out.println("5. Change PIN");
            System.out.println("6. Mini Statement");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit(sc);
                    break;

                case 3:
                    withdraw(sc);
                    break;

                case 4:
                    fastCash(sc);
                    break;

                case 5:
                    changePin(sc);
                    break;

                case 6:
                    showMiniStatement();
                    break;

                case 7:
                    VoiceAssistant.speak("Thank you for using ATM");
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    VoiceAssistant.speak("Invalid choice");
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }

    static void checkBalance() {
        VoiceAssistant.speak("Your current balance is " + balance);
        System.out.println("Current Balance: Rs " + balance);
        miniStatement.add("Balance Checked: Rs " + balance);
    }

    static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: Rs ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            miniStatement.add("Deposited: Rs " + amount);
            VoiceAssistant.speak("Amount deposited successfully");
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: Rs ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            miniStatement.add("Withdrawn: Rs " + amount);
            VoiceAssistant.speak("Please collect your cash");
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    static void fastCash(Scanner sc) {

        System.out.println("Fast Cash Options:");
        System.out.println("1. 500");
        System.out.println("2. 1000");
        System.out.println("3. 2000");
        System.out.println("4. 5000");
        System.out.print("Select option: ");

        int option = sc.nextInt();
        int amount = 0;

        switch (option) {
            case 1: amount = 500; break;
            case 2: amount = 1000; break;
            case 3: amount = 2000; break;
            case 4: amount = 5000; break;
            default:
                System.out.println("Invalid option");
                return;
        }

        if (amount <= balance) {
            balance -= amount;
            miniStatement.add("Fast Cash Withdrawn: Rs " + amount);
            VoiceAssistant.speak("Fast cash collected");
            System.out.println("Please collect your cash: Rs " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void changePin(Scanner sc) {

        System.out.print("Enter old PIN: ");
        int oldPin = sc.nextInt();

        if (oldPin == pin) {
            System.out.print("Enter new PIN: ");
            pin = sc.nextInt();
            miniStatement.add("PIN Changed");
            VoiceAssistant.speak("PIN changed successfully");
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect old PIN!");
        }
    }

    static void showMiniStatement() {

        VoiceAssistant.speak("Mini statement");
        System.out.println("----- MINI STATEMENT -----");

        if (miniStatement.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String s : miniStatement) {
                System.out.println(s);
            }
        }
    }
}
