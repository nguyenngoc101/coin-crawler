import Entity.Coin;
import crawler.Crawler;

import java.io.IOException;

/**
 * Created by framgia on 18/09/2017.
 */
public class Application {

    public static void main(String[] args) {
        Crawler crawler = new Crawler();
        try {
            System.out.println(crawler.fetchHtml("https://coinmarketcap.com/all/views/all/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
