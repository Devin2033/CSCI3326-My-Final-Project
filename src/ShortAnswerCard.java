// INHERITANCE: ShortAnswerCard IS A Card
class ShortAnswerCard extends Card {

    public ShortAnswerCard(String question, String answer) {
        super(question, answer);
    }

    // POLYMORPHISM: Yet another way to check answers
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(getAnswer().trim());
    }
}

