package parser;

import Entity.RawPrice;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ParserTest {

    private static final String HTML_DOC_PATH = "/coinmarketcap.html";

    @Test
    public void getCoinNodes_shouldReturnEnoughCoins() throws Exception {
        assertThat(Parser.getCoinNodes(getHtmlDoc()).size(), is(1114));
    }

    @Test
    public void parseCoinNode_shouldReturnExactValues() throws Exception {
        Element coinNodeElement = getCoinNodeTest();
        RawPrice expectedRawPrice = new RawPrice.RawPriceBuilder("Bitcoin", "BTC")
                .marketCap("$65,821,449,477")
                .circulatingSupply("16,574,575")
                .price("$3971.23")
                .volumn24h("$1,914,120,000")
                .percent1Hour("-0.24%")
                .percent24Hours("7.86%")
                .percen7Days("-6.31%")
                .createRawPrice();

        RawPrice parsedRawPrice = Parser.parseCoinNode(coinNodeElement);

        Assert.assertTrue(EqualsBuilder.reflectionEquals(expectedRawPrice,parsedRawPrice));
    }

    @Test
    public void parse_ReturnAllCoinValues() throws Exception {
        assertThat(Parser.parse(""), is(false));

    }

    private Document getHtmlDoc() throws IOException {
        File htmlFile = new File(getClass().getResource(HTML_DOC_PATH).getFile());
        return Jsoup.parse(htmlFile, "UTF-8");
    }

    private Element getCoinNodeTest() {
        String trTag = "<tr id=\"id-bitcoin\"  class=\"\">\n"
                + "                <td class=\"text-center\">\n"
                + "                    1\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap currency-name\">\n"
                + "                    <div class=\"s-s-bitcoin currency-logo-sprite\"></div>\n"
                + "                    <a href=\"/currencies/bitcoin/\">Bitcoin</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                    <td class=\"text-left\">BTC</td>\n"
                + "                                \n"
                + "                <td class=\"no-wrap market-cap text-right\" data-usd=\"65821449477.2\" data-btc=\"16574575.0\" >\n"
                + "                    $65,821,449,477 \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    <a href=\"/currencies/bitcoin/#markets\" class=\"price\" data-usd=\"3971.23\" data-btc=\"1.0\" >$3971.23</a>\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    <a href=\"http://blockchain.info\" target=\"_blank\"  data-supply=\"16574575.0\">\n"
                + "                        16,574,575</a>\n"
                + "                    \n"
                + "                    \n"
                + "                        \n"
                + "                    \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right \"> \n"
                + "                    <a href=\"/currencies/bitcoin/#markets\" class=\"volume\" data-usd=\"1914120000.0\" data-btc=\"481305.0\" >$1,914,120,000</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-1h  negative_change text-right\" data-usd=\"-0.24\" data-btc=\"0.00\" >-0.24%</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-24h  positive_change  text-right\" data-usd=\"7.86\" data-btc=\"0.00\" >7.86%</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-7d  negative_change text-right\" data-usd=\"-6.31\" data-btc=\"0.00\" >-6.31%</td>\n"
                + "                                \n"
                + "            </tr>";
        Element e = new Element(Tag.valueOf("tr"), "");
        e.html(trTag);
        return e;
    }

}
