package crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by framgia on 18/09/2017.
 */
public class Crawler {

    private static final String DEFAULT_CHARSET = "UTF-8";

    public String fetchHtml(String url, String charset) throws IOException {

        Scanner scanner = new Scanner(new URL(url).openStream(), charset);
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();
        return response;
    }

    public String fetchHtml(String url) throws IOException {
        return fetchHtml(url, DEFAULT_CHARSET);
    }

}
