package entity;

/**
 * Created by framgia on 19/09/2017.
 */

public class PriceDtoFactory {

    public static PriceDto getPriceDto() {
        Price price = new Price();
        Coin coin = new Coin();
        return new PriceDto(coin, price);
    }
}
