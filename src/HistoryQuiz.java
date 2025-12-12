// HistoryQuiz Class:
// -Inheritance: HistoryQuiz IS A Quiz

// This class sets up the "History of CS" quiz 

class HistoryQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "History of CS" quiz cards
    public HistoryQuiz() {
        // Input: Quiz Title and Total Number of Cards
        super("History of Computer Science", 5);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {

        addCard(new MultipleChoiceCard(
            "Who is considered the father of computer science?",
            "B",
            new String[]{
                "Bill Gates",
                "Alan Turing",
                "Steve Jobs",
                "Mark Zuckerberg"
            }
        ));
        
        addCard(new TrueFalseCard(
            "The first computer was invented in the 21st century.",
            "False"
        ));
        
        addCard(new ShortAnswerCard(
            "What does CPU stand for?",
            "Central Processing Unit"
        ));
        
        addCard(new MultipleChoiceCard(
            "Which programming language was developed first?",
            "C",
            new String[]{
                "Python",
                "Java",
                "FORTRAN",
                "JavaScript"
            }
        ));
        
        addCard(new TrueFalseCard(
            "Ada Lovelace is known as the first computer programmer.",
            "True"
        ));
    }
}