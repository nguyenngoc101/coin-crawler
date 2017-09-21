package repository;

/**
 * Created by framgia on 21/09/2017.
 */
public class RepositoryFactory {

    private static CoinRepository coinRepository;
    private static PriceRepository priceRepository;

    public static CoinRepository getCoinRepository() {
        if(coinRepository == null) {
            coinRepository = new CoinRepository();
        }
        return coinRepository;
    }

    public static PriceRepository getPriceRepository() {
        if (priceRepository == null) {
            priceRepository = new PriceRepository();
        }
        return priceRepository;
    }
}
