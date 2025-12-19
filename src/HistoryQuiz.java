// HistoryQuiz Class:
// -Inheritance: HistoryQuiz IS A Quiz

// This class sets up the "History of CS" quiz 

class HistoryQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "History of CS" quiz cards
    public HistoryQuiz() {
        // Input: Quiz Title and Total Number of Cards
        super("History of Computer Science", 10);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {

        addCard(new MultipleChoiceCard(
            "Which company created the first widely used graphical user interface (GUI)?",
            "B",
            new String[]{
                "Microsoft",
                "Xerox",
                "Apple",
                "IBM"
            }
        ));

        addCard(new MultipleChoiceCard(
            "Who is credited with popularizing the term “software engineer” during her work on the Apollo program?",
            "B",
            new String[]{
                "Ada Lovelace",
                "Margaret Hamilton",
                "Grace Hopper",
                "Katherine Johnson"
            }
        ));

        addCard(new MultipleChoiceCard(
            "Which early computer is known for being the first programmable, general-purpose electronic computer?",
            "A",
            new String[]{
                "ENIAC",
                "UNIVAC I",
                "Colossus",
                "Z3"
            }
        ));

        addCard(new ShortAnswerCard(
                "What company created the first microprocessor?",
                "intel"
        ));

        addCard(new MultipleChoiceCard(
            "What does CS stand for?",
            "B",
            new String[]{
                "Counter Strike",
                "Computer Science",
                "Computer Systems",
                "Counter Strike 2"
            }
        ));

        addCard(new MultipleChoiceCard(
            "Who invented the World Wide Web?",
            "C",
            new String[]{
                "Dennis Ritchie",
                "Ken Thompson",
                "Tim Berners-Lee",
                "Gordon Moore"
            }
        ));

        addCard(new ShortAnswerCard(
                "What company created the Windows operating system?",
                "microsoft"
        ));

        addCard(new TrueFalseCard(
            "The first computer virus was created in the 1980s.",
            "True"
        ));

        addCard(new TrueFalseCard(
            "Grace Hopper helped develop one of the first high-level programming languages, COBOL.",
            "True"
        ));

        addCard(new TrueFalseCard(
            "The transistor was invented after the first microprocessor.",
            "False"
        ));

    }
}