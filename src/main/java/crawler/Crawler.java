package crawler;

import contants.Constants;
import entity.Coin;
import entity.Price;
import entity.PriceDto;
import entity.RawPrice;
import org.jooq.SQLDialect;
import org.jooq.impl.Factory;
import parser.Parser;
import util.Converter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import static jooqGen.Tables.COIN;

/**
 * Created by framgia on 18/09/2017.
 */
public class Crawler {

    public void crawl() throws IOException, SQLException {
        /*List<RawPrice> rawPrices = Parser.parse(Constants.COIN_MARKET_URL);
        List<PriceDto> priceDtos = rawPrices.stream().map(e -> Converter.convertToPriceDto(e)).collect(Collectors.toList());
        priceDtos.stream().forEach(e -> {
            try {
                insertDB(e);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });*/

        insertCoin(null);

    }

    private void insertDB(PriceDto priceDto) throws SQLException {
        insertCoin(priceDto.getCoin());
        insertPrice(priceDto.getPrice());
    }

    private void insertPrice(Price price) throws SQLException {

    }

    private void insertCoin(Coin coin) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/coin", "root", "123456");
        Factory create = new Factory(conn, SQLDialect.MYSQL);
        create.insertInto(COIN)
                .set(COIN.CODE, "btc")
                .set(COIN.NAME, "bitcoin")
                .set(COIN.REG_TIMESTAMP, Factory.currentTimestamp())
                .set(COIN.REG_PGM_ID, this.getClass().getSimpleName())
                .execute();
    }
}
