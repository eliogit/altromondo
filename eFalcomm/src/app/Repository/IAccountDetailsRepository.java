package app.Repository;

import app.Model.Account;
import app.Model.AccountDetails;

import java.sql.SQLException;
import java.util.List;

public interface IAccountDetailsRepository {
    public int update (Long id, AccountDetails object) throws SQLException;


    public void create(AccountDetails o) throws SQLException ;


    public int delete(Long id) throws SQLException ;

    public AccountDetails find(Long id) throws SQLException ;

    public List<AccountDetails> findAll() throws SQLException ;
}
