// TrueFalseCard Class:
// -Inheritance-> TrueFalseCard IS A Card

// This class configures the True or False card/question format

class TrueFalseCard extends Card {
    
    // Method to set up a true or false card
    // Input: Question, Answer
    public TrueFalseCard(String question, String answer) {
        super(question, answer);
    }
    
    // Polymorphism: 
    // Different way to check answers
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