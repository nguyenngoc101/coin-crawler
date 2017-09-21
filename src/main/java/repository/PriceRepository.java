package repository;


import entity.Price;
import org.jooq.Table;
import org.jooq.impl.Factory;

import java.sql.SQLException;

import static config.DbFactory.getFactory;
import static jooqGen.Tables.PRICE;

/**
 * Created by framgia on 21/09/2017.
 */

public class PriceRepository extends BaseRepository {

    @Override
    public Table getTable() {
        return PRICE;
    }

    public void insert(Price price) throws SQLException {
        getFactory().insertInto(PRICE)
                .set(PRICE.PRICE_ID, (Integer) null)
                .set(PRICE.CODE_ID, price.getCodeId())
                .set(PRICE.VOLUMN, price.getVolumn())
                .set(PRICE.MARKET_CAP, price.getMarketCap())
                .set(PRICE.PRICE_, price.getPrice())
                .set(PRICE.CIRCULATING_SUPPLY, price.getCirculatingSupply())
                .set(PRICE.PERCENT_1_HOUR, price.getPercent1Hour())
                .set(PRICE.PERCENT_24_HOUR2, price.getPercent24Hours())
                .set(PRICE.PERCENT_7_DAYS, price.getPercent7Days())
                .set(PRICE.REG_TIMESTAMP, Factory.currentTimestamp())
                .set(PRICE.REG_PGM_ID, this.getClass().getSimpleName())
                .execute();
    }
}
