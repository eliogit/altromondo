package app.DAL;

import app.Model.Account;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;

import java.sql.SQLException;

public class _GenericDaoImpl extends BaseDaoImpl<Object, Long> implements _GenericDao
{
    public _GenericDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, Object.class);
    }
    // NOTE: this constructor is needed under Android in 4.30
    public _GenericDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig<Object> tableConfig) throws SQLException
    {
        super(connectionSource, tableConfig);
    }
}