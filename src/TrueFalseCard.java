// TrueFalseCard Class:
// -Inheritance-> TrueFalseCard IS A Card

// This class defines the behavior and structure of True or False questions

class TrueFalseCard extends Card {
    
    // Constructor that creates a true or false card
    // Input: Question, Answer
    public TrueFalseCard(String question, String answer) {
        super(question, answer);
    }
    
    // Polymorphism: 
    // -checks answers its own way
    @Override
    public boolean checkAnswer(String userAnswer) {
        // trims input and make it lower case
        String input = userAnswer.trim().toLowerCase();
        String correct = getAnswer().toLowerCase();
        
        // if statement to determine user's choice
        if (input.equals("t") || input.equals("true")) {
            return correct.equals("true");
        } else if (input.equals("f") || input.equals("false")) {
            return correct.equals("false");
        }
        return false;
    }


    // Method to display  
    @Override
    public void displayCard() {
        super.displayCard();
        System.out.println("(True or False)");
    }
}