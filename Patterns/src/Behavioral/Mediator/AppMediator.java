package Mediator;

import java.util.ArrayList;
import java.util.List;

public class AppMediator {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        Button button1 = new Button(mediator);
        Button button2 = new Button(mediator);

        mediator.addColleague(button1);
        mediator.addColleague(button2);

        button1.click(); // Sends message through mediator
        button2.click(); // Sends message through mediator
        button1.click(); // Sends message through mediator
        button2.click(); // Sends message through mediator
    }
}
