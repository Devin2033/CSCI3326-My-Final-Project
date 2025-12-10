// INHERITANCE: TrueFalseCard IS A Card
class TrueFalseCard extends Card {

    public TrueFalseCard(String question, String answer) {
        super(question, answer);
    }

    // POLYMORPHISM: Different way to check answers
    @Override
    public boolean checkAnswer(String userAnswer) {
        String input = userAnswer.trim().toLowerCase();
        String correct = getAnswer().toLowerCase();

        if (input.equals("t") || input.equals("true")) {
            return correct.equals("true");
        } else if (input.equals("f") || input.equals("false")) {
            return correct.equals("false");
        }
        return false;
    }

    @Override
    public void displayCard() {
        super.displayCard();
        System.out.println("(True or False)");
    }
}
