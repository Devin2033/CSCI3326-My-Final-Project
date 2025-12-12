// JavaQuiz Class:
// -Inheritance: JavaQuiz IS A Quiz

// This class sets up the "Java Trivia" quiz 

class JavaQuiz extends Quiz {
    
    // Constructor:
    // -Calls parent Quiz constructor
    // -Sets up "Web Development" quiz cards
    public JavaQuiz() {
        super("Java Trivia", 10);
        setupQuestions();
    }
    
    // Method to setup quiz cards.
    // Creates card objects using the appropriate card type
    private void setupQuestions() {

        addCard(new TrueFalseCard(
            "A static method cannot be called without creating an object.",
            "False"
        ));

        addCard(new MultipleChoiceCard(
            "What is one strength Java has over other languages?",
            "A",
            new String[]{
                "Needs to be compiled only once to be used on other platforms",
                "It is the fastest language",
                "Flexible coding",
                "It is not as verbose as other languages"
            }
        ));

        addCard(new MultipleChoiceCard(
            "What is one weakness Java has over other languages?",
            "C",
            new String[]{
                "OOP enforces organization",
                "Automatically frees up memory",
                "Slow startup time",
                "Built in GUI tools"
            }
        ));

        addCard(new TrueFalseCard(
            "OOP is forced in Java.",
            "False"
        ));

        addCard(new ShortAnswerCard(
                "What keyword is used to include external classes or packages in a Java program?",
                "import"
        ));

        addCard(new MultipleChoiceCard(
            "What does GUI stand for?",
            "C",
            new String[]{
                "Generate User Interface",
                "Graphical United Interface",
                "Graphical User Interface",
                "Generative User Incorporated"
            }
        ));

        addCard(new MultipleChoiceCard(
            "What is the best description for Encapsulation?",
            "B",
            new String[]{
                "A private method used to protect code",
                "A public method with private attributes ",
                "A public method ",
                "A public method with getter and setter functions that for public attributes"
            }
        ));

        addCard(new ShortAnswerCard(
                "What keyword is used to define a subclass in Java?",
                "extends"
        ));

        addCard(new MultipleChoiceCard(
            "What does OOP stand for?",
            "A",
            new String[]{
                "Object Oriented Programming",
                "Object Only Programming",
                "On Objects Programming",
                "Object Oriented Publisher"
            }
        ));

        addCard(new TrueFalseCard(
            "Java is the best programming language.",
            "True"
        ));

    }
}