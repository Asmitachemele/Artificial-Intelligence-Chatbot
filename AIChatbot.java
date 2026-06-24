import java.util.Scanner;

public class AIChatbot {

    public static String getResponse(String userInput) {
        userInput = userInput.toLowerCase();

        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hello! How can I assist you today?";
        }
        else if (userInput.contains("how are you")) {
            return "I am doing great! Thanks for asking.";
        }
        else if (userInput.contains("your name")) {
            return "My name is Java AI Chatbot.";
        }
        else if (userInput.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }
        else if (userInput.contains("college")) {
            return "Please tell me your college name.";
        }
        else if (userInput.contains("course")) {
            return "I can help you with Java, AI, and programming concepts.";
        }
        else if (userInput.contains("time")) {
            return "Sorry, I cannot provide real-time information.";
        }
        else if (userInput.contains("thank")) {
            return "You're welcome!";
        }
        else if (userInput.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }
        else {
            return "Sorry, I don't understand your question.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      JAVA AI CHATBOT");
        System.out.println("================================");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            String response = getResponse(input);
            System.out.println("Bot: " + response);

            if (input.equalsIgnoreCase("bye")) {
                break;
            }
        }

        scanner.close();
    }
}