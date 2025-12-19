// ShortAnswerCard Class:
// -Inheritance-> ShortAnswerCard IS A Card

// This class defines the behavior and structure of short answer questions

class ShortAnswerCard extends Card {
    
    // Constructor that creates a short answer card
    // Input: Question, Answer
    public ShortAnswerCard(String question, String answer) {
        super(question, answer);
    }
    
    // Polymorphism: 
    // -checks answers its own way
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(getAnswer().trim());
    }
}