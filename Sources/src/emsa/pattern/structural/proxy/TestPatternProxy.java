package emsa.pattern.structural.proxy;

public class TestPatternProxy {

  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd"); //J@urnalD$v
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand(" rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::" + e.getMessage());
    }
  }

}
