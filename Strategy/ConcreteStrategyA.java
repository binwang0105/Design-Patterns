import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteStrategyA implements Strategy {
  private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyB.class);
  @Override
  public void strategy(String input) {
    LOG.info("Strategy A for input : {}", input);
  }
}