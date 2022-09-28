package app.Repository;

import app.Model.Account;

import java.sql.SQLException;
import java.util.List;

public interface IAccountRepository {
    public int update (Long id, Account object) throws SQLException;


    public void create(Account o) throws SQLException ;


    public int delete(Long id) throws SQLException ;

    public Account find(Long id) throws SQLException ;

    public List<Account> findAll() throws SQLException ;
}
