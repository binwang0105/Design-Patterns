import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteStrategyB implements Strategy {
  private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyB.class);
  @Override
  public void strategy(String input) {
    LOG.info("Strategy B for input : {}", input);
  }
}