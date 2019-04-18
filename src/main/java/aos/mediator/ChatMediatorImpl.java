package aos.mediator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChatMediatorImpl implements ChatMediator {

    private Set<User> users;
    private Integer lastUserId = 0;

    public ChatMediatorImpl(){
        users = new HashSet<>();
    }


    public void sendMessage(final String message, User user) {
        users.stream().filter(u->!u.equals(user)).forEach(u-> u.receive(message));
    }

    @Override
    public void sendToMessage(String message, User user, Integer userId) {
        users.stream()
                .filter(u -> u.userId.equals(userId))
                .forEach(u -> u.receiveFrom(message,user.name));
    }

    public void addUser(User user) {
        lastUserId++;
        users.add(user);
    }
    public Integer getLastUserId(){
        return lastUserId;
    }
}
