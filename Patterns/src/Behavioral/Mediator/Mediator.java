package Mediator;

interface Mediator {

    /**
     * Forwards a message sent by a colleague to all other registered colleagues.
     * 
     * @param sender  The colleague sending the message.
     * @param message The message content sent by the colleague.
     */
    public void sendMessage(Colleague sender, String message);
}
