/**
 * This class is generated by jOOQ
 */
package generation;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Coin extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1950965270;

	/**
	 * The singleton instance of coin
	 */
	public static final Coin COIN = new Coin();

	/**
	 * No further instances allowed
	 */
	private Coin() {
		super("coin");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			generation.tables.Coin.COIN,
			generation.tables.Price.PRICE);
	}
}
