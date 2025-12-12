// AIQuiz Class:
// -Inheritance: AIQuiz IS A Quiz

// This class sets up the "Artificial Intelligence" quiz 

class AIQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "Web Development" quiz cards
    public AIQuiz() {
        super("Artificial Intelligence", 10);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {

        addCard(new TrueFalseCard(
            "AI is an acronym for Architecture Intelligence",
            "False"
        ));

        addCard(new MultipleChoiceCard(
            "Within the 4 model types subset of, or within, AI, which model type’s entire purpose is to create whole text, images, or videos based on human input?",
            "C",
            new String[]{
                "Machine Learning",
                "Deep Learning",
                "Generate AI",
                "Large Language Model / LLM"
            }
        ));

        addCard(new MultipleChoiceCard(
            "What does GPT stand for?",
            "D",
            new String[]{
                "Generation Predicative Training",
                "Generative Partial Transmission",
                "Ghost Pepper Turtles",
                "Generative Pre-trained Transformer"
            }
        ));

        addCard(new ShortAnswerCard(
                "What do we call data used to teach a model?",
                "training"
        ));
        
        addCard(new MultipleChoiceCard(
            "Which AI Robot was created in the 1980s to play and read piano music?",
            "A",
            new String[]{
                "Wabot-2",
                "R.O.B",
                "Boston Dynamic’s Spot",
                "Androbot’s Topo"
            }
        ));

        addCard(new MultipleChoiceCard(
            "What AI was the most used in the public during the Early-2020s for ridiculous image generation outcomes?",
            "B",
            new String[]{
                "Deepseek",
                "DALL-E",
                "Copilot",
                "AI Dungeon"
            }
        ));

        addCard(new ShortAnswerCard(
                "What type of AI can understand and generate human language?",
                "NLP"
        ));

        addCard(new MultipleChoiceCard(
            "Creating a new chapter in AI and its learning abilities in 1997, what game did IBM’s Deep Blue beat a worldwide master at on its first game?",
            "A",
            new String[]{
                "Chess",
                "Poker",
                "Tetris",
                "Tic Tac Toe"
            }
        ));
        
        addCard(new TrueFalseCard(
            "The components of an average computer can be used for basic AI training",
            "True"
        ));
        

        addCard(new TrueFalseCard(
            "AI can never be wrong and will always give the correct answer at all times.",
            "False"
        ));

    }
}