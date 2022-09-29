package app.DAL;

import app.Model.Account;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class __DaoFactory {
    private static __DaoFactory instance;

    public static __DaoFactory getInstance() throws SQLException {
        if (instance == null) {
            instance = new __DaoFactory();
        }
        return instance;
    }
    static __DBContext context = new __DBContext();

    static ConnectionSource conn;

    static {
        try {
            conn = context.conectar();
            //TableUtils.createTable(conn, Account.class);
            //System.out.println("Creado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Dao getAccountDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Account.class);
    }




}
