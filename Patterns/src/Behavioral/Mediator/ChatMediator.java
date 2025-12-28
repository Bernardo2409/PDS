package Mediator;

import java.util.ArrayList;
import java.util.List;

class ChatMediator implements Mediator {

    private List<Colleague> colleagues;

    public ChatMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(Colleague sender, String message) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    public void addColleague(Colleague colleague) {
        colleague.mediator = this;
        colleagues.add(colleague);
    }
}
