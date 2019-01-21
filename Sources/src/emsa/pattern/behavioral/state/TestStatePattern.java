package emsa.pattern.behavioral.state;

public class TestStatePattern {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TVContext tvContext     = new TVContext();
    TVStartState startState = new TVStartState();
    TVStopState stopState   = new TVStopState();

    tvContext.setState(startState);
    tvContext.doAction();

    tvContext.setState(stopState);
    tvContext.doAction();
  }

}
