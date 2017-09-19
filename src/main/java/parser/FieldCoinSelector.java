package parser;

/**
 * Created by framgia on 19/09/2017.
 */
public interface FieldCoinSelector {
    String DEFAULT_COIN_NODE_SELECTOR = "tr[id~=id-]";
    String NAME = "td.currency-name > a";
    String CODE = "td.text-left";
    String MARKETCAP = "td.market-cap";
    String CIRCULATING_SUPPLY = "td > a[data-supply]";
    String PRICE = "td > a.price";
    String VOLUMN24H = "td > a.volume";
    String PERCENT1HOUR = "td[class*=percent-1h]";
    String PERCENT24HOURS = "td[class*=percent-24h]";
    String PERCEN7DAYS = "td[class*=percent-7d]";
}
