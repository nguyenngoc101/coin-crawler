/**
 * This class is generated by jOOQ
 */
package generation.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PriceRecord extends org.jooq.impl.UpdatableRecordImpl<generation.tables.records.PriceRecord> {

	private static final long serialVersionUID = -2136623208;

	/**
	 * The table column <code>coin.price.price_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setPriceId(java.lang.Integer value) {
		setValue(generation.tables.Price.PRICE.PRICE_ID, value);
	}

	/**
	 * The table column <code>coin.price.price_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getPriceId() {
		return getValue(generation.tables.Price.PRICE.PRICE_ID);
	}

	/**
	 * The table column <code>coin.price.coin_id</code>
	 */
	public void setCoinId(java.lang.Integer value) {
		setValue(generation.tables.Price.PRICE.COIN_ID, value);
	}

	/**
	 * The table column <code>coin.price.coin_id</code>
	 */
	public java.lang.Integer getCoinId() {
		return getValue(generation.tables.Price.PRICE.COIN_ID);
	}

	/**
	 * The table column <code>coin.price.reg_pgm_id</code>
	 */
	public void setRegPgmId(java.lang.String value) {
		setValue(generation.tables.Price.PRICE.REG_PGM_ID, value);
	}

	/**
	 * The table column <code>coin.price.reg_pgm_id</code>
	 */
	public java.lang.String getRegPgmId() {
		return getValue(generation.tables.Price.PRICE.REG_PGM_ID);
	}

	/**
	 * The table column <code>coin.price.reg_timestamp</code>
	 */
	public void setRegTimestamp(java.sql.Timestamp value) {
		setValue(generation.tables.Price.PRICE.REG_TIMESTAMP, value);
	}

	/**
	 * The table column <code>coin.price.reg_timestamp</code>
	 */
	public java.sql.Timestamp getRegTimestamp() {
		return getValue(generation.tables.Price.PRICE.REG_TIMESTAMP);
	}

	/**
	 * The table column <code>coin.price.upd_pgm_id</code>
	 */
	public void setUpdPgmId(java.lang.String value) {
		setValue(generation.tables.Price.PRICE.UPD_PGM_ID, value);
	}

	/**
	 * The table column <code>coin.price.upd_pgm_id</code>
	 */
	public java.lang.String getUpdPgmId() {
		return getValue(generation.tables.Price.PRICE.UPD_PGM_ID);
	}

	/**
	 * The table column <code>coin.price.upd_timestamp</code>
	 */
	public void setUpdTimestamp(java.sql.Timestamp value) {
		setValue(generation.tables.Price.PRICE.UPD_TIMESTAMP, value);
	}

	/**
	 * The table column <code>coin.price.upd_timestamp</code>
	 */
	public java.sql.Timestamp getUpdTimestamp() {
		return getValue(generation.tables.Price.PRICE.UPD_TIMESTAMP);
	}

	/**
	 * The table column <code>coin.price.volumn</code>
	 */
	public void setVolumn(java.lang.Double value) {
		setValue(generation.tables.Price.PRICE.VOLUMN, value);
	}

	/**
	 * The table column <code>coin.price.volumn</code>
	 */
	public java.lang.Double getVolumn() {
		return getValue(generation.tables.Price.PRICE.VOLUMN);
	}

	/**
	 * The table column <code>coin.price.percent_1_hour</code>
	 */
	public void setPercent_1Hour(java.lang.Double value) {
		setValue(generation.tables.Price.PRICE.PERCENT_1_HOUR, value);
	}

	/**
	 * The table column <code>coin.price.percent_1_hour</code>
	 */
	public java.lang.Double getPercent_1Hour() {
		return getValue(generation.tables.Price.PRICE.PERCENT_1_HOUR);
	}

	/**
	 * The table column <code>coin.price.percent_24_hour2</code>
	 */
	public void setPercent_24Hour2(java.lang.Double value) {
		setValue(generation.tables.Price.PRICE.PERCENT_24_HOUR2, value);
	}

	/**
	 * The table column <code>coin.price.percent_24_hour2</code>
	 */
	public java.lang.Double getPercent_24Hour2() {
		return getValue(generation.tables.Price.PRICE.PERCENT_24_HOUR2);
	}

	/**
	 * The table column <code>coin.price.percent_7_days</code>
	 */
	public void setPercent_7Days(java.lang.Double value) {
		setValue(generation.tables.Price.PRICE.PERCENT_7_DAYS, value);
	}

	/**
	 * The table column <code>coin.price.percent_7_days</code>
	 */
	public java.lang.Double getPercent_7Days() {
		return getValue(generation.tables.Price.PRICE.PERCENT_7_DAYS);
	}

	/**
	 * Create a detached PriceRecord
	 */
	public PriceRecord() {
		super(generation.tables.Price.PRICE);
	}
}
