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
public class CoinRecord extends org.jooq.impl.UpdatableRecordImpl<generation.tables.records.CoinRecord> {

	private static final long serialVersionUID = -517699318;

	/**
	 * The table column <code>coin.coin.coin_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCoinId(java.lang.Integer value) {
		setValue(generation.tables.Coin.COIN.COIN_ID, value);
	}

	/**
	 * The table column <code>coin.coin.coin_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getCoinId() {
		return getValue(generation.tables.Coin.COIN.COIN_ID);
	}

	/**
	 * The table column <code>coin.coin.reg_pgm_id</code>
	 */
	public void setRegPgmId(java.lang.String value) {
		setValue(generation.tables.Coin.COIN.REG_PGM_ID, value);
	}

	/**
	 * The table column <code>coin.coin.reg_pgm_id</code>
	 */
	public java.lang.String getRegPgmId() {
		return getValue(generation.tables.Coin.COIN.REG_PGM_ID);
	}

	/**
	 * The table column <code>coin.coin.reg_timestamp</code>
	 */
	public void setRegTimestamp(java.sql.Timestamp value) {
		setValue(generation.tables.Coin.COIN.REG_TIMESTAMP, value);
	}

	/**
	 * The table column <code>coin.coin.reg_timestamp</code>
	 */
	public java.sql.Timestamp getRegTimestamp() {
		return getValue(generation.tables.Coin.COIN.REG_TIMESTAMP);
	}

	/**
	 * The table column <code>coin.coin.upd_pgm_id</code>
	 */
	public void setUpdPgmId(java.lang.String value) {
		setValue(generation.tables.Coin.COIN.UPD_PGM_ID, value);
	}

	/**
	 * The table column <code>coin.coin.upd_pgm_id</code>
	 */
	public java.lang.String getUpdPgmId() {
		return getValue(generation.tables.Coin.COIN.UPD_PGM_ID);
	}

	/**
	 * The table column <code>coin.coin.upd_timestamp</code>
	 */
	public void setUpdTimestamp(java.sql.Timestamp value) {
		setValue(generation.tables.Coin.COIN.UPD_TIMESTAMP, value);
	}

	/**
	 * The table column <code>coin.coin.upd_timestamp</code>
	 */
	public java.sql.Timestamp getUpdTimestamp() {
		return getValue(generation.tables.Coin.COIN.UPD_TIMESTAMP);
	}

	/**
	 * The table column <code>coin.coin.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(generation.tables.Coin.COIN.NAME, value);
	}

	/**
	 * The table column <code>coin.coin.name</code>
	 */
	public java.lang.String getName() {
		return getValue(generation.tables.Coin.COIN.NAME);
	}

	/**
	 * The table column <code>coin.coin.code</code>
	 */
	public void setCode(java.lang.String value) {
		setValue(generation.tables.Coin.COIN.CODE, value);
	}

	/**
	 * The table column <code>coin.coin.code</code>
	 */
	public java.lang.String getCode() {
		return getValue(generation.tables.Coin.COIN.CODE);
	}

	/**
	 * The table column <code>coin.coin.max_supply</code>
	 */
	public void setMaxSupply(java.lang.Long value) {
		setValue(generation.tables.Coin.COIN.MAX_SUPPLY, value);
	}

	/**
	 * The table column <code>coin.coin.max_supply</code>
	 */
	public java.lang.Long getMaxSupply() {
		return getValue(generation.tables.Coin.COIN.MAX_SUPPLY);
	}

	/**
	 * Create a detached CoinRecord
	 */
	public CoinRecord() {
		super(generation.tables.Coin.COIN);
	}
}