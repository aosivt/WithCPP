package aos.patterns;

public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name, med.getLastUserId());
        med.addUser(this);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void sendTo(String msg, Integer id) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendToMessage(msg,this, id);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message"+msg);
    }

    @Override
    public void receiveFrom(String msg, String name) {
        System.out.println(this.name+": Received Message"+msg+" From: "+name);
    }
}
