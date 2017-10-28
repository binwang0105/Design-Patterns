public class SimpleClient {
  public static void main(String[] args) {
    Strategy strategy = new ConcreteStrategyA();
    SimpleContext context = new SimpleContext(strategy);
    context.action("Hellow, world");
  }
}