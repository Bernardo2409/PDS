package Decorator;

public class Main {
    public static void main(String[] args) {
        // Criando a mensagem original
        Message message = new TextMessage("Hello, World!");

        // Decorando a mensagem com negrito, itálico e sublinhado
        Message boldMessage = new BoldMessageDecorator(message);
        Message italicMessage = new ItalicMessageDecorator(boldMessage);
        Message underlinedMessage = new UnderlinedMessageDecorator(italicMessage);

        // Exibindo a mensagem decorada
        System.out.println("Original Message: " + message.getContent());
        System.out.println("Bold Message: " + boldMessage.getContent());
        System.out.println("Italic and Bold Message: " + italicMessage.getContent());
        System.out.println("Italic, Bold and Underlined Message: " + underlinedMessage.getContent());
    }
}
