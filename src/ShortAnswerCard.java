// ShortAnswerCard Class:
// -Inheritance-> ShortAnswerCard IS A Card

// This class configures the open ended card/question format

class ShortAnswerCard extends Card {
    
    public ShortAnswerCard(String question, String answer) {
        super(question, answer);
    }
    
    // Polymorphism: 
    // Another way to check answers
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(getAnswer().trim());
    }
}