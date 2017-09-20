package util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by framgia on 20/09/2017.
 */
public class ConverterTest {

    @Test
    public void convertMarketCap_shouldReturnUnknowMarketCap() throws Exception {
        assertThat(Converter.convertMarketCap("?"), is(-999.0));
    }

    @Test
    public void convertMarketCap_shouldReturnMarketCap() throws Exception {
        assertThat(Converter.convertMarketCap("$64,403,104,561"), is(64403104561.0));
    }

    @Test
    public void convertPrice_shouldReturnPrice() throws Exception {
        assertThat(Converter.convertPrice("$3885.22"), is(3885.22));
    }

    @Test
    public void convertCirculatingSupply_shouldReturnNormalCirculatingSupply() throws Exception {
        assertThat(Converter.convertCirculatingSupply("16,576,437"), is(16576437.0));
    }

    @Test
    public void convertCirculatingSupply_shouldReturnUnknownCirculatingSupply() throws Exception {
        assertThat(Converter.convertCirculatingSupply("?"), is(-999.0));
        assertThat(Converter.convertCirculatingSupply("?*"), is(-999.0));
        assertThat(Converter.convertCirculatingSupply("?**"), is(-999.0));
    }

    @Test
    public void convertVolumn_returnLowVol() throws Exception {
        assertThat(Converter.convertVolumn("Low Vol"), is(-111.0));
    }

    @Test
    public void convertVolumn_returnNormalVolumn() throws Exception {
        assertThat(Converter.convertVolumn("$1,460,310,000"), is(1460310000.0));
    }

    @Test
    public void convertVolumn_returnUnknownVolumn() throws Exception {
        assertThat(Converter.convertVolumn("?"), is(-999.0));
    }

    @Test
    public void convertVolumn_returnNormalPercent() throws Exception {
        assertThat(Converter.convertPercent("51470.10%"), is(51470.10));
        assertThat(Converter.convertPercent("-99.08%"), is(-99.08));
    }

    @Test
    public void convertVolumn_returnUnknownPercent() throws Exception {
        assertThat(Converter.convertPercent("?"), is(-999.0));
    }
}
