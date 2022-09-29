package app.Repository;

import app.Model.Account;
import app.DAL.__DaoFactory;

import java.sql.SQLException;
import java.util.List;

public class AccountRepository implements IAccountRepository{
    @Override
    public int update(Long id, Account object) throws SQLException {
        Account tempObject = (Account) __DaoFactory.getInstance().getAccountDao().queryForId(id);
        tempObject.setName(object.getName());
        tempObject.setPassword(object.getPassword());
        return __DaoFactory.getInstance().getAccountDao().update(tempObject);
    }
    @Override
    public void create(Account o) throws SQLException {
        __DaoFactory.getInstance().getAccountDao().create(o);

    }

    @Override
    public int delete(Long id) throws SQLException {

        return __DaoFactory.getInstance().getAccountDao().delete(__DaoFactory.getInstance().getAccountDao().queryForId(id));
    }

    @Override
    public Account find(Long id) throws SQLException {
        return (Account) __DaoFactory.getInstance().getAccountDao().queryForId(id);
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccountDao().queryForAll();
    }

}
