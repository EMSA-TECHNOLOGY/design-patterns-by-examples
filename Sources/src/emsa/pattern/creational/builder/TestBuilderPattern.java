package emsa.pattern.creational.builder;

public class TestBuilderPattern {
  public static void main(String[] args) {
    // Using builder to get the object in a single line of code and
    // without any inconsistent state or arguments management issues
    BankAccount newAccount = 
        new BankAccount.BankAccountBuilder("User1", "0123456789")
        .withEmail("contact@gpcoder.com")
        .wantNewsletter(true).build();
    System.out.println(newAccount);
  }
}
