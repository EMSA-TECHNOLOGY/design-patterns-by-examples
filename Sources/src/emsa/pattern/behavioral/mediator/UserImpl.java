package emsa.pattern.behavioral.mediator;

public class UserImpl extends User {

  public UserImpl(ChatMediator med, String name) {
    super(med, name);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void send(String msg) {
    System.out.println("---");
    System.out.println(this.name + " is sending the message: " + msg);
    mediator.sendMessage(msg, this);

  }

  @Override
  public void receive(String msg) {
    System.out.println(this.name + " received the message: " + msg);
  }

}
