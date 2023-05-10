import java.util.Scanner;

    public class RockPaperScissors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Create a thread for accepting user input
            Thread userInputThread = new Thread(() -> {
                System.out.println("Select either rock, paper, or scissors: ");
                String userChoice = scanner.nextLine();
                while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid input. Select either rock, paper, or scissors: ");
                    userChoice = scanner.nextLine();
                }
                System.out.println("You chose " + userChoice);

                // Generate and display computer's choice
                int computerChoice = (int) (Math.random() * 3); // 0 = rock, 1 = paper, 2 = scissors
                String computerChoiceString = "";
                switch (computerChoice) {
                    case 0:
                        computerChoiceString = "rock";
                        break;
                    case 1:
                        computerChoiceString = "paper";
                        break;
                    case 2:
                        computerChoiceString = "scissors";
                        break;
                }
                System.out.println("Computer chose " + computerChoiceString);

                // Determine winner
                if (userChoice.equals("rock") && computerChoiceString.equals("scissors") ||
                        userChoice.equals("paper") && computerChoiceString.equals("rock") ||
                        userChoice.equals("scissors") && computerChoiceString.equals("paper")) {
                    System.out.println("You win!");
                } else if (userChoice.equals(computerChoiceString)) {
                    System.out.println("Tie!");
                } else {
                    System.out.println("Computer wins!");
                }
            });
            // Start user input thread
            userInputThread.start();
            // Wait for user input thread to finish

            try {
                userInputThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }


