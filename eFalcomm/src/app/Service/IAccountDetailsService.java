package app.Service;

import app.Model.Account;
import app.Model.AccountDetails;

import java.sql.SQLException;
import java.util.List;

public interface IAccountDetailsService {
    public void add(AccountDetails object) throws SQLException;
    public AccountDetails findById(Long id) throws SQLException;
    public int delete (Long id) throws SQLException;
    public int update (Long id, AccountDetails object) throws SQLException;
    public List<AccountDetails> findAll () throws SQLException;
}
