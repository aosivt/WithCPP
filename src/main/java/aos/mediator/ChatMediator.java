package aos.mediator;

public interface ChatMediator {
    public void sendMessage(String message, User user);
    public void sendToMessage(String message, User user, Integer userId);
    void addUser(User user);

    public Integer getLastUserId();
}
