// Quiz Class:
// -Uses Encapsulation
// -Keeps score and manages cards privately

class Quiz {
    private String title; // Store the title of the quiz
    private Card[] cards; // Array that holds all the card objects for a quiz
    private int totalCards; // To keep track of how many cards have been added to the quiz
    
    // Constructor:
    // Creates a new quiz with a given title and max number of cards
    public Quiz(String title, int maxCards) {
        this.title = title;
        this.cards = new Card[maxCards];
        this.totalCards = 0;
    }
    
    // Method that adds a new card to the quiz
    public void addCard(Card card) {
        if (totalCards < cards.length) {
            cards[totalCards] = card;
            totalCards++;
        }
    }
    
    // Method to start Quiz
    public int startQuiz(java.util.Scanner scanner) {
        // Displays quiz header with title
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("  " + title);
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("(Type 'quit' at any time to return to menu)");
        
        // to keep track of score
        int score = 0; 
        
        // Displays corresponding quiz cards
        for (int i = 0; i < totalCards; i++) {
            System.out.println("\n━━━ Question " + (i + 1) + " of " + totalCards + " ━━━");
            
            // Polymorphism: 
            // -Different cards display differently
            cards[i].displayCard();
            
            System.out.print("\nYour answer: ");
            String userAnswer = scanner.nextLine(); // gets user input
            
            // Check if user wants to quit
            if (userAnswer.trim().equalsIgnoreCase("quit")) {
                // Prints quiz cancelled message
                System.out.println("\n⚠️  Quiz cancelled. Returning to main menu...");

                return -1;  // Return -1 to indicate quiz was quit
            }
            
            // Polymorphism: 
            // -Different cards check answers differently
            if (cards[i].checkAnswer(userAnswer)) {
                System.out.println("✓ Correct!");
                score++;
            } else {
                System.out.println("✗ Incorrect!");
            }
        }
        
        // returns quiz score
        return score;
    }
    
    // to get quiz title
    public String getTitle() {
        return title;
    }
    
    // to get total card number in a quiz
    public int getTotalCards() {
        return totalCards;
    }
}