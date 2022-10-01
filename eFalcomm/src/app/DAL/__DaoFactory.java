package app.DAL;

import app.Model.Account;
import app.Model.AccountDetails;
import app.Model.Alarms;
import app.Model.DoorAlarms;
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

//    boolean creado1 = false;
//    boolean creado2 = false;
    static __DBContext context = new __DBContext();

    static ConnectionSource conn;

    static {
        try {
            conn = context.conectar();
/*
            if(getInstance().creado1 == false){
                TableUtils.createTable(conn, Account.class);
                System.out.println("Creado1");
                getInstance().creado1=true;
            }

            if(getInstance().creado2 == false) {
                TableUtils.createTable(conn, AccountDetails.class);
                System.out.println("Creado2");
                getInstance().creado2=true;
            }
*/
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Dao getAccountDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Account.class);
    }
    public Dao getAccountDetailsDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, AccountDetails.class);
    }
    public Dao getAlarmsDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Alarms.class);
    }
    public Dao getDoorAlarmsDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, DoorAlarms.class);
    }



}
