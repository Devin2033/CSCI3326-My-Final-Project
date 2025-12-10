// Abstraction: Abstract Class
// you can't make a Card directly,
// but you can make specific types of cards
abstract class Card {
    private String question;  // ENCAPSULATION: private = hidden from outside
    private String answer;

    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // Abstract method - each card type will check answers differently
    public abstract boolean checkAnswer(String userAnswer);

    // Public method - anyone can use this to get the question
    public String getQuestion() {
        return question;
    }

    // Protected - only this class and children can access
    protected String getAnswer() {
        return answer;
    }

    public void displayCard() {
        System.out.println("\n" + question);
    }
}