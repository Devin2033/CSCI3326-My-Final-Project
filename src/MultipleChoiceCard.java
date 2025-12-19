// MultipleChoiceCard Class:
// -Inheritance-> MultipleChoiceCard IS A Card

// This class defines the behavior and structure of multiple choice questions

class MultipleChoiceCard extends Card {
    private String[] options;
    
    // Constructor that creates a multiple choice card
    // Input: Question, Answer, Answer Choices
    public MultipleChoiceCard(String question, String answer, String[] options) {
        super(question, answer);  // Calls parent constructor
        this.options = options;
    }
    
    // Polymophism:
    // -checks answers its own way
    @Override
    public boolean checkAnswer(String userAnswer) {
        // returns user's answer choice.
        // trims any extra spaces, ignores capitilization
        return userAnswer.trim().equalsIgnoreCase(getAnswer().trim());
    }
    
    // Polymophism: 
    // -This card displays differently than parent
    @Override
    public void displayCard() {
        super.displayCard();
        // Since answer choices for a question are stored as an array,
        // this loop goes through and prints out the choices
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) + ") " + options[i]);
        }
    }
}