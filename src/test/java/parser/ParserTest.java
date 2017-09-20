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
import java.util.List;

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
    public void parseCoinNode_shouldReturnExactValues_2() throws Exception {
        Element coinNodeElement = getCoinNodeTest2();
        RawPrice expectedRawPrice = new RawPrice.RawPriceBuilder("BitcoinDark", "BTCD")
                .marketCap("$130,432,853")
                .circulatingSupply("1,288,862")
                .price("$101.20")
                .volumn24h("$236,222")
                .percent1Hour("0.48%")
                .percent24Hours("14.79%")
                .percen7Days("6.25%")
                .createRawPrice();

        RawPrice parsedRawPrice = Parser.parseCoinNode(coinNodeElement);
        Assert.assertTrue(EqualsBuilder.reflectionEquals(expectedRawPrice,parsedRawPrice));
    }

    @Test
    public void parseCoinNode_shouldReturnExactValues_3() throws Exception {
        Element coinNodeElement = getCoinNodeTest3();
        RawPrice expectedRawPrice = new RawPrice.RawPriceBuilder("Bankcoin", "B@")
                .marketCap("$19,436,297")
                .circulatingSupply("11,513,848")
                .price("$1.69")
                .volumn24h("$4,860")
                .percent1Hour("0.03%")
                .percent24Hours("?")
                .percen7Days("-12.73%")
                .createRawPrice();

        RawPrice parsedRawPrice = Parser.parseCoinNode(coinNodeElement);
        Assert.assertTrue(EqualsBuilder.reflectionEquals(expectedRawPrice,parsedRawPrice));
    }

    @Test
    public void parse_ReturnAllCoinValues() throws Exception {
        List<RawPrice> rawPrices = Parser.parse(getHtmlDoc());
        assertThat(rawPrices.size(), is(1114));
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

    private Element getCoinNodeTest2() {
        String trTag = "<tr id=\"id-bitcoindark\"  class=\"\">\n"
                + "                <td class=\"text-center\">\n"
                + "                    44\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap currency-name\">\n"
                + "                    <div class=\"s-s-bitcoindark currency-logo-sprite\"></div>\n"
                + "                    <a href=\"/currencies/bitcoindark/\">BitcoinDark</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                    <td class=\"text-left\">BTCD</td>\n"
                + "                                \n"
                + "                <td class=\"no-wrap market-cap text-right\" data-usd=\"130432853.029\" data-btc=\"32797.1604534\" >\n"
                + "                    $130,432,853 \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    <a href=\"/currencies/bitcoindark/#markets\" class=\"price\" data-usd=\"101.2\" data-btc=\"0.0254466\" >$101.20</a>\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    \n"
                + "                        <span class=\"stale\" data-supply=\"1288862.18408\">1,288,862</span>\n"
                + "                    \n"
                + "                    \n"
                + "                        \n"
                + "                    \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right \"> \n"
                + "                    <a href=\"/currencies/bitcoindark/#markets\" class=\"volume\" data-usd=\"236222.0\" data-btc=\"59.3979\" >$236,222</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-1h  positive_change  text-right\" data-usd=\"0.48\" data-btc=\"0.75\" >0.48%</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-24h  positive_change  text-right\" data-usd=\"14.79\" data-btc=\"9.55\" >14.79%</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-7d  positive_change  text-right\" data-usd=\"6.25\" data-btc=\"14.10\" >6.25%</td>\n"
                + "                                \n"
                + "            </tr>";
        Element e = new Element(Tag.valueOf("tr"), "");
        e.html(trTag);
        return e;
    }

    private Element getCoinNodeTest3() {
        String trTag = "<tr id=\"id-bankcoin\"  class=\"\">\n"
                + "                <td class=\"text-center\">\n"
                + "                    137\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap currency-name\">\n"
                + "                    <div class=\"s-s-bankcoin currency-logo-sprite\"></div>\n"
                + "                    <a href=\"/assets/bankcoin/\">Bankcoin</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                    <td class=\"text-left\">B@</td>\n"
                + "                                \n"
                + "                <td class=\"no-wrap market-cap text-right\" data-usd=\"19436296.5318\" data-btc=\"4887.23700517\" >\n"
                + "                    $19,436,297 \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    <a href=\"/assets/bankcoin/#markets\" class=\"price\" data-usd=\"1.68808\" data-btc=\"0.000424466\" >$1.69</a>\n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right\">\n"
                + "                    \n"
                + "                        <span  data-supply=\"11513848.0\">11,513,848</span>\n"
                + "                    \n"
                + "                    \n"
                + "                        *\n"
                + "                    \n"
                + "                </td>\n"
                + "                <td class=\"no-wrap text-right \"> \n"
                + "                    <a href=\"/assets/bankcoin/#markets\" class=\"volume\" data-usd=\"4860.49\" data-btc=\"1.22217\" >$4,860</a>\n"
                + "                </td>\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-1h  positive_change  text-right\" data-usd=\"0.03\" data-btc=\"0.37\" >0.03%</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"text-right\">?</td>\n"
                + "                \n"
                + "\n"
                + "                \n"
                + "                <td class=\"no-wrap percent-7d  negative_change text-right\" data-usd=\"-12.73\" data-btc=\"-6.24\" >-12.73%</td>\n"
                + "                                \n"
                + "            </tr>";
        Element e = new Element(Tag.valueOf("tr"), "");
        e.html(trTag);
        return e;
    }

}
