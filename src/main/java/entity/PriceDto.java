package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by framgia on 18/09/2017.
 */

@Getter
@Setter
public class PriceDto {

    private Coin coin;
    private Price price;

    public PriceDto() {

    }

    public PriceDto(Coin coin, Price price) {
        this.coin = coin;
        this.price = price;
    }
}
