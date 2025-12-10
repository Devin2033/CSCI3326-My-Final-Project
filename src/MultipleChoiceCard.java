// INHERITANCE: MultipleChoiceCard IS A Card
class MultipleChoiceCard extends Card {
    private String[] options;

    public MultipleChoiceCard(String question, String answer, String[] options) {
        super(question, answer);  // Call parent constructor
        this.options = options;
    }

    // POLYMORPHISM: This card checks answers its own way
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(getAnswer().trim());
    }

    // POLYMORPHISM: This card displays differently than parent
    @Override
    public void displayCard() {
        super.displayCard();
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) + ") " + options[i]);
        }
    }
}
