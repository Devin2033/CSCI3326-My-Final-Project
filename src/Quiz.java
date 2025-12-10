// ENCAPSULATION: Quiz keeps score and manages cards privately
class Quiz {
    private String title;
    private Card[] cards;
    private int totalCards;

    public Quiz(String title, int maxCards) {
        this.title = title;
        this.cards = new Card[maxCards];
        this.totalCards = 0;
    }

    public void addCard(Card card) {
        if (totalCards < cards.length) {
            cards[totalCards] = card;
            totalCards++;
        }
    }

    public int startQuiz(java.util.Scanner scanner) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("  " + title);
        System.out.println("╚════════════════════════════════════════╝");

        int score = 0;

        for (int i = 0; i < totalCards; i++) {
            System.out.println("\n━━━ Question " + (i + 1) + " of " + totalCards + " ━━━");

            // POLYMORPHISM IN ACTION: Different cards display differently!
            cards[i].displayCard();

            System.out.print("\nYour answer: ");
            String userAnswer = scanner.nextLine();

            // POLYMORPHISM IN ACTION: Different cards check answers differently!
            if (cards[i].checkAnswer(userAnswer)) {
                System.out.println("✓ Correct!");
                score++;
            } else {
                System.out.println("✗ Incorrect!");
            }
        }

        return score;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalCards() {
        return totalCards;
    }
}
