import crawler.Crawler;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by framgia on 18/09/2017.
 */
public class Application {

    public static void main(String[] args) throws IOException, SQLException {
        new Crawler().crawl();
    }
}
