import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! I'm your AI assistant. Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("bye")) {
                System.out.println("Chatbot: Goodbye! Have a nice day.");
                break;
            } 

            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Chatbot: Hello! How can I help you today?");
            } 

            else if (input.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, but I'm doing great! How about you?");
            } 

            else if (input.contains("time")) {
                System.out.println("Chatbot: I'm sorry, I can't tell the time yet!");
            } 

            else if (input.contains("your name")) {
                System.out.println("Chatbot: I'm an AI chatbot built by a Java developer!");
            }

            else {
                System.out.println("Chatbot: I'm not sure how to respond to that. Could you please rephrase?");
            }
        }

        scanner.close();
    }

}