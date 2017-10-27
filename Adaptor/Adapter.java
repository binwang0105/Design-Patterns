import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adapter implements ITarget {
	private static Logger LOG = LoggerFactory.getLogger(Adapter.class);
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
	LOG.info("Adapter.request");
		adaptee.onRequest();
	}
}