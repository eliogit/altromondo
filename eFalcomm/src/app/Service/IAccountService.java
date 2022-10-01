package app.Service;

import app.Model.Account;
import app.Model.AccountDetails;

import java.sql.SQLException;
import java.util.List;

public interface IAccountService {
    public void add(Account object) throws SQLException;
    public Account findById(Long id) throws SQLException;
    public int delete (Long id) throws SQLException;
    public int update (Long id, Account object) throws SQLException;
    public List<Account> findAll () throws SQLException;
}
