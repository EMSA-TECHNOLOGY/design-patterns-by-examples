package emsa.pattern.behavioral.state;

public class TestStatePattern {

  public static void main(String[] args) {
    TVContext tvContext     = new TVContext();
    TVStartState startState = new TVStartState();
    TVStopState stopState   = new TVStopState();

    tvContext.setState(startState);
    tvContext.applyState();

    tvContext.setState(stopState);
    tvContext.applyState();
  }

}
