package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.AccountDetails;

import java.sql.SQLException;
import java.util.List;

public class AccountDetailsRepository implements IAccountDetailsRepository{
    @Override
    public int update(Long id, AccountDetails object) throws SQLException {
        AccountDetails tempObject = (AccountDetails) __DaoFactory.getInstance().getAccountDetailsDao().queryForId(id);
        tempObject.setAccount(object.getAccount());
        tempObject.setDetails(object.getDetails());
        return __DaoFactory.getInstance().getAccountDetailsDao().update(tempObject);
    }
    @Override
    public void create(AccountDetails o) throws SQLException {
        __DaoFactory.getInstance().getAccountDetailsDao().create(o);

    }

    @Override
    public int delete(Long id) throws SQLException {

        return __DaoFactory.getInstance().getAccountDetailsDao().delete(__DaoFactory.getInstance().getAccountDetailsDao().queryForId(id));
    }

    @Override
    public AccountDetails find(Long id) throws SQLException {
        return (AccountDetails) __DaoFactory.getInstance().getAccountDetailsDao().queryForId(id);
    }

    @Override
    public List<AccountDetails> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccountDetailsDao().queryForAll();
    }

}
