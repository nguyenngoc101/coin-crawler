package parser;

import Entity.RawPrice;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by framgia on 19/09/2017.
 */
public class Parser {

    public static Elements getCoinNodes(Document document) {
        return document.body().select(FieldCoinSelector.DEFAULT_COIN_NODE_SELECTOR);
    }

    public static Document getHtmlDoc(String url) throws IOException {
        return Jsoup.connect(url).maxBodySize(0).get();
    }

    public static RawPrice parseCoinNode(Element coinNodeElement) {
        String name = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.NAME);
        String code = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.CODE);
        String marketCap = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.MARKETCAP);
        String price = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.PRICE);;
        String circulatingSupply = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.CIRCULATING_SUPPLY);;
        String volumn24h = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.VOLUMN24H);;
        String percent1Hour = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.PERCENT1HOUR);;
        String percent24Hours = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.PERCENT24HOURS);;
        String percen7Days = Parser.getTextValueCoinNode(coinNodeElement, FieldCoinSelector.PERCEN7DAYS);

        return new RawPrice.RawPriceBuilder(name, code)
                .marketCap(marketCap)
                .price(price)
                .circulatingSupply(circulatingSupply)
                .volumn24h(volumn24h)
                .percent1Hour(percent1Hour)
                .percent24Hours(percent24Hours)
                .percen7Days(percen7Days)
                .createRawPrice();
    }

    public static List<RawPrice> parse(String url) throws IOException {
        Document doc = getHtmlDoc(url);
        Elements coinElements = getCoinNodes(doc);
        return coinElements.stream().map(e -> parseCoinNode(e)).collect(Collectors.toList());
    }

    public static String getTextValueCoinNode(Element coinNodeElement, String selector) {
        return coinNodeElement.select(selector).get(0).childNode(0).toString();
    }
}
