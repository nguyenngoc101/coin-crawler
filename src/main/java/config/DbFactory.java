package config;

import org.jooq.SQLDialect;
import org.jooq.impl.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by framgia on 21/09/2017.
 */
public class DbFactory {

    private static Factory factory;
    private static  Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null ) {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/coin", "root", "123456");
        }
        return connection;
    }

    public static Factory getFactory() throws SQLException {
        if (factory == null) {
            factory = new Factory(getConnection(), SQLDialect.MYSQL);
        }
        return factory;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
