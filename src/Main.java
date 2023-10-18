import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInputPlaceholder = s.nextLine();
        int userInput = Integer.parseInt(userInputPlaceholder);
        int winnings = lottery.determineWinnings(userInput);
        if (winnings == 100) {
            System.out.println("Exact Match: You win $100!");
        } else if (winnings == 10) {
            System.out.println("Match all digits but not correct order: You win $10!");
        } else if (winnings == 3) {
            System.out.println("Match one digit: You win $3!");
        } else {
            System.out.println("No matching numbers, you win nothing :(");
        }
    }
}

