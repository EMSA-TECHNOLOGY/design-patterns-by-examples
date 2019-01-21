package emsa.pattern.structural.bridge;

public class Client {

  public static void main(String[] args) {

    CheckingAccount ca = new CheckingAccount();
    SavingAccount sa = new SavingAccount();

    Bank vietcomBank = new VietcomBank(ca);
    vietcomBank.openAccount();

    Bank tpBank = new TPBank(ca);
    tpBank.openAccount();

    Bank tpBank2 = new TPBank(sa);
    tpBank2.openAccount();

  }

}
