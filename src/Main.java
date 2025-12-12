// Main Class:
// -Handles menu and results

import java.util.Scanner;

public class Main {
    
    // Method to clear the terminal screen
    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name");
            
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
    
    // Method to display results
    public static void displayResults(String quizTitle, int score, int total) {
        // Display Quiz Result Header
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("           QUIZ RESULTS");
        System.out.println("╚════════════════════════════════════════╝");

        System.out.println("Quiz: " + quizTitle);            // Diplays quiz title
        System.out.println("Score: " + score + "/" + total); // Displays total score
        
        double percentage = (double) score / total * 100;
        System.out.println("Percentage: " + String.format("%.0f", percentage) + "%"); // Displays score percentage
        
        // if statement for grade message
        if (percentage >= 80) {
            System.out.println("Grade: Excellent! 🌟");
        } else if (percentage >= 60) {
            System.out.println("Grade: Good job! 👍");
        } else {
            System.out.println("Grade: Keep studying! 📚");
        }
    }
    
    // Main Method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // For input
        boolean running = true; // flag variable 
        
        // Prints welcome message header
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("     WELCOME TO TEAMS' 5 QUIZ APP!");
        System.out.println("╚════════════════════════════════════════╝");
        
        while (running) {
            
            // Prints selection header
            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("         CHOOSE YOUR QUIZ");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            // Prints Selection menu
            System.out.println("1. History of Computer Science");
            System.out.println("2. Java Trivia");
            System.out.println("3. Artificial Intelligence");
            System.out.println("4. Exit");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("\nEnter your choice (1-4): ");


            // Gets user input
            String choice = scan.nextLine();
            clearScreen();

            // Temporary object 
            Quiz selectedQuiz = null;
            
            // Switch statement 
            // Creates the corresponding quiz object based on user input
            switch (choice) {
                case "1":
                    selectedQuiz = new HistoryQuiz();
                    break;
                case "2":
                    selectedQuiz = new JavaQuiz();
                    break;
                case "3":
                    selectedQuiz = new AIQuiz();
                    break;
                case "4":
                    // Displays goodbye message when user types "4"
                    System.out.println("\nThank you for using Team 5's Quiz App!");
                    System.out.println("Goodbye! 👋");
                    running = false; // updates flag variable to quit loop
                    continue;
                default:
                    // Displays error if anything else beside 1-4 is inputed
                    System.out.println("\n❌ Invalid choice. Please try again.");
                    continue;
            }
            
            // Starts the selected quiz
            if (selectedQuiz != null) { 
                int score = selectedQuiz.startQuiz(scan);
                
                // If statement to check
                // if quiz was quit (score = -1) or completed normally
                if (score == -1) {
                    // Quiz was quit, clear screen and go back to menu
                    clearScreen();
                } else {
                    // Quiz completed, show results
                    displayResults(selectedQuiz.getTitle(), score, selectedQuiz.getTotalCards());
                    
                    System.out.println("\nPress Enter to return to main menu...");
                    scan.nextLine();
                    
                    // Clears screen before showing menu again
                    clearScreen();
                }
            }
        }

        scan.close(); // close scanner 
    }
}
