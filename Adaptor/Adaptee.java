import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adaptee {
	private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);
	public void onRequest() {
		LOGGER.info("Adaptee.onRequest()");
	}
}