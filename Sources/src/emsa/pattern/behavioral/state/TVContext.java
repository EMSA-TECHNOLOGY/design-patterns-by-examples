package emsa.pattern.behavioral.state;

public class TVContext implements State {

  private State state;

  @Override
  public void doAction() {
    this.state.doAction();

  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

}
