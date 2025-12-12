// Card Class:
// -Implements abstraction (abstract class)
// -You can't make a Card directly,
//  but you can make specific types of cards.

abstract class Card {
    // Variables to store question and answer
    private String question;
    private String answer;
    
    // To setup a quiz card
    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    // Abstract method: 
    // -each card type will check answers differently
    public abstract boolean checkAnswer(String userAnswer);
    
    // Public method:
    // -any class can use this to get the question
    public String getQuestion() {
        return question;
    }
    
    // Protected method:
    // -so only this class and children can access
    protected String getAnswer() {
        return answer;
    }
    
    // method to display quiz card
    public void displayCard() {
        System.out.println("\n" + question);
    }
}