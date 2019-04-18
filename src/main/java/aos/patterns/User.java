package aos.patterns;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    protected final Integer userId;

    public User(ChatMediator med, String name,Integer userId){
        this.mediator=med;
        this.name = name;
        this.userId = userId;
    }

    public abstract void send(String msg);

    public abstract void sendTo(String msg, Integer id);

    public abstract void receive(String msg);
    public abstract void receiveFrom(String msg, String name);

    @Override
    public int hashCode() {
        return this.userId;
    }

    @Override
    public boolean equals(Object obj) {
        return userId.equals(((User)obj).userId);
    }
}
