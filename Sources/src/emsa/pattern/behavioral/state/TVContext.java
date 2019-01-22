package emsa.pattern.behavioral.state;

public class TVContext {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void applyState() {
    this.state.doAction();
  }

}
