public class Main {

    // Method to create History of CS Quiz
    public static Quiz createHistoryQuiz() {
        Quiz quiz = new Quiz("History of Computer Science", 5);

        quiz.addCard(new MultipleChoiceCard(
                "Who is considered the father of computer science?",
                "B",
                new String[]{
                        "Bill Gates",
                        "Alan Turing",
                        "Steve Jobs",
                        "Mark Zuckerberg"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "The first computer was invented in the 21st century.",
                "False"
        ));

        quiz.addCard(new ShortAnswerCard(
                "What does CPU stand for?",
                "Central Processing Unit"
        ));

        quiz.addCard(new MultipleChoiceCard(
                "Which programming language was developed first?",
                "C",
                new String[]{
                        "Python",
                        "Java",
                        "FORTRAN",
                        "JavaScript"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "Ada Lovelace is known as the first computer programmer.",
                "True"
        ));

        return quiz;
    }

    // Method to create Web Development Quiz
    public static Quiz createWebDevQuiz() {
        Quiz quiz = new Quiz("Web Development", 5);

        quiz.addCard(new MultipleChoiceCard(
                "What does HTML stand for?",
                "A",
                new String[]{
                        "HyperText Markup Language",
                        "High Tech Modern Language",
                        "Home Tool Markup Language",
                        "Hyperlinks and Text Markup Language"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "CSS is used to add interactivity to websites.",
                "False"
        ));

        quiz.addCard(new ShortAnswerCard(
                "What programming language runs in web browsers?",
                "JavaScript"
        ));

        quiz.addCard(new MultipleChoiceCard(
                "Which tag is used to create a hyperlink in HTML?",
                "B",
                new String[]{
                        "<link>",
                        "<a>",
                        "<href>",
                        "<url>"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "HTTP stands for HyperText Transfer Protocol.",
                "True"
        ));

        return quiz;
    }

    // Method to create AI Quiz
    public static Quiz createAIQuiz() {
        Quiz quiz = new Quiz("Artificial Intelligence", 5);

        quiz.addCard(new MultipleChoiceCard(
                "What does AI stand for?",
                "A",
                new String[]{
                        "Artificial Intelligence",
                        "Automated Information",
                        "Advanced Integration",
                        "Analytical Intelligence"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "Machine Learning is a subset of Artificial Intelligence.",
                "True"
        ));

        quiz.addCard(new ShortAnswerCard(
                "What type of AI can understand and generate human language?",
                "NLP"
        ));

        quiz.addCard(new MultipleChoiceCard(
                "Which company developed ChatGPT?",
                "C",
                new String[]{
                        "Google",
                        "Microsoft",
                        "OpenAI",
                        "Meta"
                }
        ));

        quiz.addCard(new TrueFalseCard(
                "Neural networks are inspired by the human brain.",
                "True"
        ));

        return quiz;
    }

    public static void displayResults(String quizTitle, int score, int total) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("           QUIZ RESULTS");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Quiz: " + quizTitle);
        System.out.println("Score: " + score + "/" + total);

        double percentage = (double) score / total * 100;
        System.out.println("Percentage: " + String.format("%.0f", percentage) + "%");

        if (percentage >= 80) {
            System.out.println("Grade: Excellent! 🌟");
        } else if (percentage >= 60) {
            System.out.println("Grade: Good job! 👍");
        } else {
            System.out.println("Grade: Keep studying! 📚");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean running = true;

        // Welcome message
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("     WELCOME TO FLASHCARD QUIZ APP!");
        System.out.println("╚════════════════════════════════════════╝");

        while (running) {
            // Display menu
            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("         CHOOSE YOUR QUIZ");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("1. History of Computer Science");
            System.out.println("2. Web Development");
            System.out.println("3. Artificial Intelligence");
            System.out.println("4. Exit");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("\nEnter your choice (1-4): ");

            String choice = scanner.nextLine();
            Quiz selectedQuiz = null;

            // POLYMORPHISM: We can store different quiz types in one variable!
            switch (choice) {
                case "1":
                    selectedQuiz = createHistoryQuiz();
                    break;
                case "2":
                    selectedQuiz = createWebDevQuiz();
                    break;
                case "3":
                    selectedQuiz = createAIQuiz();
                    break;
                case "4":
                    System.out.println("\nThank you for using Flashcard Quiz App!");
                    System.out.println("Goodbye! 👋");
                    running = false;
                    continue;
                default:
                    System.out.println("\n❌ Invalid choice. Please try again.");
                    continue;
            }

            // Start the selected quiz
            if (selectedQuiz != null) {
                int score = selectedQuiz.startQuiz(scanner);
                displayResults(selectedQuiz.getTitle(), score, selectedQuiz.getTotalCards());

                System.out.println("\nPress Enter to return to main menu...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
