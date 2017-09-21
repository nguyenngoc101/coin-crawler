package repository;

import entity.Coin;
import org.jooq.Table;
import org.jooq.impl.Factory;

import java.sql.SQLException;

import static config.DbFactory.getFactory;
import static jooqGen.Tables.COIN;

/**
 * Created by framgia on 21/09/2017.
 */
public class CoinRepository extends BaseRepository {

    public void insert(Coin coin) throws SQLException {
    getFactory().insertInto(COIN)
            .set(COIN.COIN_ID, (Integer)null)
            .set(COIN.CODE, coin.getCode())
            .set(COIN.NAME, coin.getName())
            .set(COIN.REG_TIMESTAMP, Factory.currentTimestamp())
            .set(COIN.REG_PGM_ID, this.getClass().getSimpleName())
            .execute();
    }

    @Override
    public Table getTable() {
        return COIN;
    }
}
