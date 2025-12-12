// AIQuiz Class:
// -Inheritance: AIQuiz IS A Quiz

// This class sets up the "Artificial Intelligence" quiz 

class AIQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "Web Development" quiz cards
    public AIQuiz() {
        super("Artificial Intelligence", 5);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {
        addCard(new MultipleChoiceCard(
            "What does AI stand for?",
            "A",
            new String[]{
                "Artificial Intelligence",
                "Automated Information",
                "Advanced Integration",
                "Analytical Intelligence"
            }
        ));
        
        addCard(new TrueFalseCard(
            "Machine Learning is a subset of Artificial Intelligence.",
            "True"
        ));
        
        addCard(new ShortAnswerCard(
            "What type of AI can understand and generate human language?",
            "NLP"
        ));
        
        addCard(new MultipleChoiceCard(
            "Which company developed ChatGPT?",
            "C",
            new String[]{
                "Google",
                "Microsoft",
                "OpenAI",
                "Meta"
            }
        ));
        
        addCard(new TrueFalseCard(
            "Neural networks are inspired by the human brain.",
            "True"
        ));
    }
}