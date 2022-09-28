package app.DAL;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class __DBContext {
        public ConnectionSource conectar() throws SQLException {
            final String URL = "jdbc:sqlite:C://db/AccessController.db";
            ConnectionSource connectionSource = new JdbcConnectionSource(URL);
            return connectionSource;
        }


}
