// WebDevQuiz Class:
// -Inheritance: WebDevQuiz IS A Quiz

// This class sets up the "Web Development" quiz 

class WebDevQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "Web Development" quiz cards
    public WebDevQuiz() {
        super("Web Development", 5);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {
        addCard(new MultipleChoiceCard(
            "What does HTML stand for?",
            "A",
            new String[]{
                "HyperText Markup Language",
                "High Tech Modern Language",
                "Home Tool Markup Language",
                "Hyperlinks and Text Markup Language"
            }
        ));
        
        addCard(new TrueFalseCard(
            "CSS is used to add interactivity to websites.",
            "False"
        ));
        
        addCard(new ShortAnswerCard(
            "What programming language runs in web browsers?",
            "JavaScript"
        ));
        
        addCard(new MultipleChoiceCard(
            "Which tag is used to create a hyperlink in HTML?",
            "B",
            new String[]{
                "<link>",
                "<a>",
                "<href>",
                "<url>"
            }
        ));
        
        addCard(new TrueFalseCard(
            "HTTP stands for HyperText Transfer Protocol.",
            "True"
        ));
    }
}