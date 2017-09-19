package Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by framgia on 19/09/2017.
 */

@Getter
@Setter
public class RawPrice {
    private String name;
    private String code;
    private String marketCap;
    private String price;
    private String circulatingSupply;
    private String volumn24h;
    private String percent1Hour;
    private String percent24Hours;
    private String percent7Days;

    public RawPrice(String name, String code, String marketCap, String price, String circulatingSupply, String volumn24h, String percent1Hour, String percent24Hours, String percen7Days) {
        this.name = name;
        this.code = code;
        this.marketCap = marketCap;
        this.price = price;
        this.circulatingSupply = circulatingSupply;
        this.volumn24h = volumn24h;
        this.percent1Hour = percent1Hour;
        this.percent24Hours = percent24Hours;
        this.percent7Days = percen7Days;
    }

    public static class RawPriceBuilder {
        private String name;
        private String code;
        private String marketCap;
        private String price;
        private String circulatingSupply;
        private String volumn24h;
        private String percent1Hour;
        private String percent24Hours;
        private String percen7Days;

        public RawPriceBuilder(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public RawPriceBuilder marketCap(String marketCap) {
            this.marketCap = marketCap;
            return this;
        }

        public RawPriceBuilder price(String price) {
            this.price = price;
            return this;
        }

        public RawPriceBuilder circulatingSupply(String circulatingSupply) {
            this.circulatingSupply = circulatingSupply;
            return this;
        }

        public RawPriceBuilder volumn24h(String volumn24h) {
            this.volumn24h = volumn24h;
            return this;
        }

        public RawPriceBuilder percent1Hour(String percent1Hour) {
            this.percent1Hour = percent1Hour;
            return this;
        }

        public RawPriceBuilder percent24Hours(String percent24Hours) {
            this.percent24Hours = percent24Hours;
            return this;
        }

        public RawPriceBuilder percen7Days(String percen7Days) {
            this.percen7Days = percen7Days;
            return this;
        }

        public RawPrice createRawPrice() {
            return new RawPrice(name, code, marketCap,price, circulatingSupply,volumn24h, percent1Hour, percent24Hours,percen7Days);
        }

    }
}
