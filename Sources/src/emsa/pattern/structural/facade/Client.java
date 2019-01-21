package emsa.pattern.structural.facade;

public class Client {

  public static void main(String[] args) {
    ShopFacade.getInstance().buyProductByCashWithFreeShipping("client1@emsa.com");
    ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("client1@emsa.com", "0988.999.999");
  }

}
