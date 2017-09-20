package util;

import entity.PriceDto;
import entity.PriceDtoFactory;
import entity.RawPrice;
import contants.Constants;

import java.sql.Timestamp;

public class Converter {

    public static PriceDto convertToPriceDto(RawPrice rawPrice) {
        PriceDto priceDto = PriceDtoFactory.getPriceDto();
        priceDto.getCoin().setCode(rawPrice.getCode());
        priceDto.getCoin().setName(rawPrice.getName());
        priceDto.getPrice().setMarketCap(convertMarketCap(rawPrice.getMarketCap()));
        priceDto.getPrice().setPrice(convertPrice(rawPrice.getPrice()));
        priceDto.getPrice().setCirculatingSupply(convertCirculatingSupply(rawPrice.getCirculatingSupply()));
        priceDto.getPrice().setVolumn(convertVolumn(rawPrice.getVolumn24h()));
        priceDto.getPrice().setPercent1Hour(convertPercent(rawPrice.getPercent1Hour()));
        priceDto.getPrice().setPercent24Hours(convertPercent(rawPrice.getPercent24Hours()));
        priceDto.getPrice().setPercent7Days(convertPercent(rawPrice.getPercent7Days()));
        priceDto.getPrice().setRegTime(new Timestamp(System.currentTimeMillis()));
        return priceDto;
    }

    public static Double convertPercent(String percent) {
        if (percent == Constants.UNKNOWN) {
            return Constants.UNKNOWN_PERCENT;
        }
        return Double.valueOf(percent.replaceAll("%", Constants.EMPTY));
    }

    public static Double convertVolumn(String volumn24h) {
        if (volumn24h == Constants.LOW_VOLUM) {
            return Constants.LOW_VOLUMM;
        }
        if (volumn24h == Constants.UNKNOWN) {
            return Constants.UNKNOWN_VOLUMN;
        }
        return convertMoney(volumn24h);
    }

    public static Double convertCirculatingSupply(String circulatingSupply) {
        if (circulatingSupply.contains(Constants.UNKNOWN)) {
            return Constants.UNKNOWN_CIRCULATING_SUPPLY;
        }
        return convertMoney(circulatingSupply);
    }

    public static Double convertPrice(String price) {
        return convertMoney(price);
    }


    public static Double convertMarketCap(String marketCap) {
        if (marketCap == Constants.UNKNOWN) {
            return Constants.UNKNOWN_MARKETCAP;
        }

        return convertMoney(marketCap);
    }

    public static Double convertMoney(String money) {
        return Double.valueOf(money.replaceAll("\\$|,", Constants.EMPTY));
    }

}
