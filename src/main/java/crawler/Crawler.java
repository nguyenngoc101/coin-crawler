package crawler;

import entity.Price;
import entity.PriceDto;
import entity.RawPrice;
import lombok.Getter;
import lombok.Setter;
import parser.Parser;
import repository.CoinRepository;
import repository.PriceRepository;
import util.Constants;
import util.Converter;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import static config.DbFactory.closeConnection;
import static repository.RepositoryFactory.getCoinRepository;
import static repository.RepositoryFactory.getPriceRepository;

/**
 * Created by framgia on 18/09/2017.
 */


public class Crawler {

    public void crawl() throws IOException, SQLException {
        List<RawPrice> rawPrices = Parser.parse(Constants.COIN_MARKET_URL);
        List<PriceDto> priceDtos = rawPrices.stream().map(e -> Converter.convertToPriceDto(e)).collect(Collectors.toList());
        priceDtos.stream().forEach(e -> {
            try {
                insertDB(e);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            finally {
                try {
                    closeConnection();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });


    }

    private void insertDB(PriceDto priceDto) throws SQLException {
        getCoinRepository().insert(priceDto.getCoin());
        getPriceRepository().insert(priceDto.getPrice());
    }
}
